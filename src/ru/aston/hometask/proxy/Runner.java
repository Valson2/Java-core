package ru.aston.hometask.proxy;

import ru.aston.hometask.proxy.entities.Administrator;
import ru.aston.hometask.proxy.entities.Client;
import ru.aston.hometask.proxy.entities.User;
import ru.aston.hometask.proxy.impls.SettingsAccessImpl;
import ru.aston.hometask.proxy.impls.SettingsAccessProxy;
import ru.aston.hometask.proxy.interfaces.SettingsAccess;

public class Runner {
	public static void main(String[] args) {
		User admin = new Administrator("Vasya");
		User client = new Client("Dima");
		SettingsAccess access = new SettingsAccessProxy(new SettingsAccessImpl());
		access.getAccess(client);
		access.getAccess(admin);
	}
}
