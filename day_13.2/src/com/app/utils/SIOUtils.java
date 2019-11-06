package com.app.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.BankAccount;

public class SIOUtils {
	public static void storeAcctInfo(HashMap<String, BankAccount> hm, String fn) throws IOException {
		// OOS--FOS --fileName
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fn))) {
			out.writeObject(hm);
		}
	}

	// write a static method to restore acct info from bin file --using
	// de-serialization
	@SuppressWarnings("unchecked")
	public static HashMap<String, BankAccount> restoreAcctInfo(String fileName) throws Exception {
		// OIS--FIS -- file
		// create file class instance --metadata of file
		// validate
		File f1 = new File(fileName);
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
				return (HashMap<String, BankAccount>) in.readObject();
			}
		}
		// no data file exists
		return new HashMap<>();
	}
}
