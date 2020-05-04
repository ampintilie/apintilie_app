package com.example.apintilie_app;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddNote() {
    return new ActionOnlyNavDirections(R.id.action_addNote);
  }
}
