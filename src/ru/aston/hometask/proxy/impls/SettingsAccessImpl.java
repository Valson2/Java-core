package ru.aston.hometask.proxy.impls;

import ru.aston.hometask.proxy.entities.User;
import ru.aston.hometask.proxy.interfaces.SettingsAccess;

public class SettingsAccessImpl implements SettingsAccess {

	@Override
	public void getAccess(User user) {
		System.out.println("Successfull getting access");
	}

}
