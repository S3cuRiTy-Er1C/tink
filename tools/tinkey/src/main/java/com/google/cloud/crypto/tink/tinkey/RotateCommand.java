// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
////////////////////////////////////////////////////////////////////////////////

package com.google.cloud.crypto.tink.tinkey;

/**
 * Rotates an existing keyset.
 */
public class RotateCommand extends AddRotateOptions implements Command {
  @Override
  public void run() throws Exception {
    rotate(outFilename, inFilename, credentialFilename, keyTypeValue, keyFormatValue);
  }

  /**
   * Generates a fresh key with type {@code keyTypeValue} and format {@code keyFormatValue}, and
   * adds it as the primary key of the keyset in {@code inFilename} (using
   * {@code credentialFilename} to decrypt if it is encrypted). Writes the resulting keyset to
   * {@code outFilename}.
   */
  public static void rotate(String outFilename, String inFilename, String credentialFilename,
      String keyTypeValue, String keyFormatValue) throws Exception {
    throw new Exception("Not Implemented Yet");
  }
}