/*
 * Copyright (C) 2015 Willi Ye
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.grarak.kerneladiutor.utils.kernel;

import android.content.Context;

import com.grarak.kerneladiutor.utils.Constants;
import com.grarak.kerneladiutor.utils.Utils;
import com.grarak.kerneladiutor.utils.root.Control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by willi on 02.01.15.
 */
public class Misc implements Constants {

    public static void setTcpCongestion(String tcpCongestion, Context context) {
        Control.runCommand(tcpCongestion, null, Control.CommandType.TCP_CONGESTION, context);
    }

    public static String getCurTcpCongestion() {
        return getTcpAvailableCongestions().get(0);
    }

    public static List<String> getTcpAvailableCongestions() {
        return new ArrayList<>(Arrays.asList(Utils.readFile(TCP_AVAILABLE_CONGESTIONS).split(" ")));
    }
}
