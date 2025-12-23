package ru.aston.hometask.proxy.impls;

import ru.aston.hometask.proxy.entities.User;
import ru.aston.hometask.proxy.interfaces.SettingsAccess;

public class SettingsAccessProxy implements SettingsAccess {
	private SettingsAccess access;

	public SettingsAccessProxy(SettingsAccess access) {
		this.access = access;
	}

	@Override
	public void getAccess(User user) {
		if (user.isAccess()) {
			access.getAccess(user);
		} else {
			System.out.println("Access denied");
		}
	}
}
