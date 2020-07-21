package com.example.mvvm3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MyViewModel extends ViewModel
{
    private MutableLiveData<String> users;

    public LiveData<String> getUsers()
    {
        if (users == null)
        {
            users = new MutableLiveData<String>();
            loadUsers();
        }

        return users;
    }

    private void loadUsers()
    {
        // Do an asynchronous operation to fetch users.
        users.setValue("hello from mansour");
    }
}