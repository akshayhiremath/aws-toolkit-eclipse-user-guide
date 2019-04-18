/*
# Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License").  You may not
# use this file except in compliance with the License.  A copy of the License
# is located at
#
#  http://aws.amazon.com/apache2.0
#
# or in the "LICENSE" file accompanying this file. This file is distributed on
# an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
# express or implied. See the License for the specific language governing
# permissions and limitations under the License.
*/
package com.example.lambda.demo;

@Override
public String handleRequest(String input, Context context) {
  context.getLogger().log("Input: " + input);
  String output = "Hello, " + input + "!";
  return output;
}
