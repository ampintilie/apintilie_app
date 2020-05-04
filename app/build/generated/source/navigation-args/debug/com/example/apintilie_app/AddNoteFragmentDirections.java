package com.example.apintilie_app;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class AddNoteFragmentDirections {
  private AddNoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSaveNote() {
    return new ActionOnlyNavDirections(R.id.action_saveNote);
  }
}
