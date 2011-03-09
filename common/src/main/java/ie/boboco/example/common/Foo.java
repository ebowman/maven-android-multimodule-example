/*
 * Copyright 2011 Eric Bowman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ie.boboco.example.common;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Document me.
 *
 * @author Eric Bowman
 * @since 2011-03-09 10:13
 */
public class Foo implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public static Creator<Foo> CREATOR = new Creator<Foo>() {

        @Override
        public Foo createFromParcel(Parcel source) {
            return new Foo();
        }

        @Override
        public Foo[] newArray(int size) {
            return new Foo[size];
        }
    };
}
