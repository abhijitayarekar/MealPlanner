/*
 * Copyright (C) 2014 The Android Open Source Project
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

package com.mealplanner.navigationdrawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Adapter for the planet data used in our drawer menu,
 */
public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ViewHolder> {
    private String[] mDataset;
    private OnItemClickListener mListener;

    /**
     * Interface for receiving click events from cells.
     */
    public interface OnItemClickListener {
        public void onClick(View view, int position);
    }

    /**
     * Custom viewholder for our planet views.
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mTextView;

        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public PlanetAdapter(String[] myDataset, OnItemClickListener listener) {
        mDataset = myDataset;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater vi = LayoutInflater.from(parent.getContext());
        View v = vi.inflate(com.mealplanner.navigationdrawer.R.layout.drawer_list_item, parent, false);
        TextView tv = (TextView) v.findViewById(android.R.id.text1);
        return new ViewHolder(tv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset[position]);
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static final class BuildConfig {
      public static final boolean DEBUG = Boolean.parseBoolean("true");
      public static final String APPLICATION_ID = "com.mealplanner.navigationdrawer";
      public static final String BUILD_TYPE = "debug";
      public static final String FLAVOR = "";
      public static final int VERSION_CODE = 1;
      public static final String VERSION_NAME = "1.0";
    }

    public static final class R {
      public static final class anim {
        public static final int abc_fade_in=0x7f010000;
        public static final int abc_fade_out=0x7f010001;
        public static final int abc_grow_fade_in_from_bottom=0x7f010002;
        public static final int abc_popup_enter=0x7f010003;
        public static final int abc_popup_exit=0x7f010004;
        public static final int abc_shrink_fade_out_from_bottom=0x7f010005;
        public static final int abc_slide_in_bottom=0x7f010006;
        public static final int abc_slide_in_top=0x7f010007;
        public static final int abc_slide_out_bottom=0x7f010008;
        public static final int abc_slide_out_top=0x7f010009;
      }
      public static final class array {
        public static final int planets_array=0x7f020000;
      }
      public static final class attr {
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarDivider=0x7f030000;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarItemBackground=0x7f030001;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarPopupTheme=0x7f030002;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>wrap_content</td><td>0</td><td></td></tr>
         * </table>
         */
        public static final int actionBarSize=0x7f030003;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarSplitStyle=0x7f030004;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarStyle=0x7f030005;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarTabBarStyle=0x7f030006;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarTabStyle=0x7f030007;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarTabTextStyle=0x7f030008;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarTheme=0x7f030009;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionBarWidgetTheme=0x7f03000a;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionButtonStyle=0x7f03000b;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionDropDownStyle=0x7f03000c;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionLayout=0x7f03000d;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionMenuTextAppearance=0x7f03000e;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int actionMenuTextColor=0x7f03000f;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeBackground=0x7f030010;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeCloseButtonStyle=0x7f030011;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeCloseDrawable=0x7f030012;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeCopyDrawable=0x7f030013;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeCutDrawable=0x7f030014;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeFindDrawable=0x7f030015;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModePasteDrawable=0x7f030016;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModePopupWindowStyle=0x7f030017;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeSelectAllDrawable=0x7f030018;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeShareDrawable=0x7f030019;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeSplitBackground=0x7f03001a;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeStyle=0x7f03001b;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionModeWebSearchDrawable=0x7f03001c;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionOverflowButtonStyle=0x7f03001d;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int actionOverflowMenuStyle=0x7f03001e;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int actionProviderClass=0x7f03001f;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int actionViewClass=0x7f030020;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int activityChooserViewStyle=0x7f030021;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int alertDialogButtonGroupStyle=0x7f030022;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int alertDialogCenterButtons=0x7f030023;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int alertDialogStyle=0x7f030024;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int alertDialogTheme=0x7f030025;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int allowStacking=0x7f030026;
        /**
         * <p>May be a floating point value, such as "<code>1.2</code>".
         */
        public static final int alpha=0x7f030027;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int arrowHeadLength=0x7f030028;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int arrowShaftLength=0x7f030029;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int autoCompleteTextViewStyle=0x7f03002a;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int background=0x7f03002b;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int backgroundSplit=0x7f03002c;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int backgroundStacked=0x7f03002d;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int backgroundTint=0x7f03002e;
        /**
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         */
        public static final int backgroundTintMode=0x7f03002f;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int barLength=0x7f030030;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int borderlessButtonStyle=0x7f030031;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f030032;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonBarNegativeButtonStyle=0x7f030033;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonBarNeutralButtonStyle=0x7f030034;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonBarPositiveButtonStyle=0x7f030035;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f030036;
        /**
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>bottom</td><td>50</td><td></td></tr>
         * <tr><td>top</td><td>30</td><td></td></tr>
         * </table>
         */
        public static final int buttonGravity=0x7f030037;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonPanelSideLayout=0x7f030038;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonStyle=0x7f030039;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int buttonStyleSmall=0x7f03003a;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int buttonTint=0x7f03003b;
        /**
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         */
        public static final int buttonTintMode=0x7f03003c;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int cardBackgroundColor=0x7f03003d;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int cardCornerRadius=0x7f03003e;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int cardElevation=0x7f03003f;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int cardMaxElevation=0x7f030040;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int cardPreventCornerOverlap=0x7f030041;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int cardUseCompatPadding=0x7f030042;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int checkboxStyle=0x7f030043;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int checkedTextViewStyle=0x7f030044;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int closeIcon=0x7f030045;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int closeItemLayout=0x7f030046;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int collapseContentDescription=0x7f030047;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int collapseIcon=0x7f030048;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int color=0x7f030049;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorAccent=0x7f03004a;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorBackgroundFloating=0x7f03004b;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorButtonNormal=0x7f03004c;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorControlActivated=0x7f03004d;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorControlHighlight=0x7f03004e;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorControlNormal=0x7f03004f;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorPrimary=0x7f030050;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorPrimaryDark=0x7f030051;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int colorSwitchThumbNormal=0x7f030052;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int commitIcon=0x7f030053;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentInsetEnd=0x7f030054;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentInsetEndWithActions=0x7f030055;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentInsetLeft=0x7f030056;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentInsetRight=0x7f030057;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentInsetStart=0x7f030058;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentInsetStartWithNavigation=0x7f030059;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentPadding=0x7f03005a;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentPaddingBottom=0x7f03005b;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentPaddingLeft=0x7f03005c;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentPaddingRight=0x7f03005d;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int contentPaddingTop=0x7f03005e;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int controlBackground=0x7f03005f;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int customNavigationLayout=0x7f030060;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int defaultQueryHint=0x7f030061;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int dialogPreferredPadding=0x7f030062;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int dialogTheme=0x7f030063;
        /**
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>disableHome</td><td>20</td><td></td></tr>
         * <tr><td>homeAsUp</td><td>4</td><td></td></tr>
         * <tr><td>none</td><td>0</td><td></td></tr>
         * <tr><td>showCustom</td><td>10</td><td></td></tr>
         * <tr><td>showHome</td><td>2</td><td></td></tr>
         * <tr><td>showTitle</td><td>8</td><td></td></tr>
         * <tr><td>useLogo</td><td>1</td><td></td></tr>
         * </table>
         */
        public static final int displayOptions=0x7f030064;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int divider=0x7f030065;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int dividerHorizontal=0x7f030066;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int dividerPadding=0x7f030067;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int dividerVertical=0x7f030068;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int drawableSize=0x7f030069;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int drawerArrowStyle=0x7f03006a;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int dropDownListViewStyle=0x7f03006b;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int dropdownListPreferredItemHeight=0x7f03006c;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int editTextBackground=0x7f03006d;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int editTextColor=0x7f03006e;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int editTextStyle=0x7f03006f;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int elevation=0x7f030070;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int expandActivityOverflowButtonDrawable=0x7f030071;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int gapBetweenBars=0x7f030072;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int goIcon=0x7f030073;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int height=0x7f030074;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int hideOnContentScroll=0x7f030075;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int homeAsUpIndicator=0x7f030076;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int homeLayout=0x7f030077;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int icon=0x7f030078;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int iconifiedByDefault=0x7f030079;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int imageButtonStyle=0x7f03007a;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int indeterminateProgressStyle=0x7f03007b;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int initialActivityCount=0x7f03007c;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int isLightTheme=0x7f03007d;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int itemPadding=0x7f03007e;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int layout=0x7f03007f;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int layoutManager=0x7f030080;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int listChoiceBackgroundIndicator=0x7f030081;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int listDividerAlertDialog=0x7f030082;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int listItemLayout=0x7f030083;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int listLayout=0x7f030084;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int listMenuViewStyle=0x7f030085;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int listPopupWindowStyle=0x7f030086;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int listPreferredItemHeight=0x7f030087;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int listPreferredItemHeightLarge=0x7f030088;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int listPreferredItemHeightSmall=0x7f030089;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int listPreferredItemPaddingLeft=0x7f03008a;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int listPreferredItemPaddingRight=0x7f03008b;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int logo=0x7f03008c;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int logoDescription=0x7f03008d;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int maxButtonHeight=0x7f03008e;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int measureWithLargestChild=0x7f03008f;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int multiChoiceItemLayout=0x7f030090;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int navigationContentDescription=0x7f030091;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int navigationIcon=0x7f030092;
        /**
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>listMode</td><td>1</td><td></td></tr>
         * <tr><td>normal</td><td>0</td><td></td></tr>
         * <tr><td>tabMode</td><td>2</td><td></td></tr>
         * </table>
         */
        public static final int navigationMode=0x7f030093;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int overlapAnchor=0x7f030094;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int paddingEnd=0x7f030095;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int paddingStart=0x7f030096;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int panelBackground=0x7f030097;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int panelMenuListTheme=0x7f030098;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int panelMenuListWidth=0x7f030099;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int popupMenuStyle=0x7f03009a;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int popupTheme=0x7f03009b;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int popupWindowStyle=0x7f03009c;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int preserveIconSpacing=0x7f03009d;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int progressBarPadding=0x7f03009e;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int progressBarStyle=0x7f03009f;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int queryBackground=0x7f0300a0;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int queryHint=0x7f0300a1;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int radioButtonStyle=0x7f0300a2;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int ratingBarStyle=0x7f0300a3;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int ratingBarStyleIndicator=0x7f0300a4;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int ratingBarStyleSmall=0x7f0300a5;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int reverseLayout=0x7f0300a6;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int searchHintIcon=0x7f0300a7;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int searchIcon=0x7f0300a8;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int searchViewStyle=0x7f0300a9;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int seekBarStyle=0x7f0300aa;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int selectableItemBackground=0x7f0300ab;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int selectableItemBackgroundBorderless=0x7f0300ac;
        /**
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>always</td><td>2</td><td></td></tr>
         * <tr><td>collapseActionView</td><td>8</td><td></td></tr>
         * <tr><td>ifRoom</td><td>1</td><td></td></tr>
         * <tr><td>never</td><td>0</td><td></td></tr>
         * <tr><td>withText</td><td>4</td><td></td></tr>
         * </table>
         */
        public static final int showAsAction=0x7f0300ad;
        /**
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>beginning</td><td>1</td><td></td></tr>
         * <tr><td>end</td><td>4</td><td></td></tr>
         * <tr><td>middle</td><td>2</td><td></td></tr>
         * <tr><td>none</td><td>0</td><td></td></tr>
         * </table>
         */
        public static final int showDividers=0x7f0300ae;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int showText=0x7f0300af;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int singleChoiceItemLayout=0x7f0300b0;
        /**
         * <p>May be an integer value, such as "<code>100</code>".
         */
        public static final int spanCount=0x7f0300b1;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int spinBars=0x7f0300b2;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int spinnerDropDownItemStyle=0x7f0300b3;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int spinnerStyle=0x7f0300b4;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int splitTrack=0x7f0300b5;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int srcCompat=0x7f0300b6;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int stackFromEnd=0x7f0300b7;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int state_above_anchor=0x7f0300b8;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int subMenuArrow=0x7f0300b9;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int submitBackground=0x7f0300ba;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int subtitle=0x7f0300bb;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int subtitleTextAppearance=0x7f0300bc;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int subtitleTextColor=0x7f0300bd;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int subtitleTextStyle=0x7f0300be;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int suggestionRowLayout=0x7f0300bf;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int switchMinWidth=0x7f0300c0;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int switchPadding=0x7f0300c1;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int switchStyle=0x7f0300c2;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int switchTextAppearance=0x7f0300c3;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int textAllCaps=0x7f0300c4;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int textAppearanceLargePopupMenu=0x7f0300c5;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int textAppearanceListItem=0x7f0300c6;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int textAppearanceListItemSmall=0x7f0300c7;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int textAppearancePopupMenuHeader=0x7f0300c8;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int textAppearanceSearchResultSubtitle=0x7f0300c9;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int textAppearanceSearchResultTitle=0x7f0300ca;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int textAppearanceSmallPopupMenu=0x7f0300cb;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int textColorAlertDialogListItem=0x7f0300cc;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int textColorSearchUrl=0x7f0300cd;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int theme=0x7f0300ce;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int thickness=0x7f0300cf;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int thumbTextPadding=0x7f0300d0;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int thumbTint=0x7f0300d1;
        /**
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>add</td><td>10</td><td></td></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         */
        public static final int thumbTintMode=0x7f0300d2;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int tickMark=0x7f0300d3;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int tickMarkTint=0x7f0300d4;
        /**
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>add</td><td>10</td><td></td></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         */
        public static final int tickMarkTintMode=0x7f0300d5;
        /**
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         */
        public static final int title=0x7f0300d6;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int titleMargin=0x7f0300d7;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int titleMarginBottom=0x7f0300d8;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int titleMarginEnd=0x7f0300d9;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int titleMarginStart=0x7f0300da;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int titleMarginTop=0x7f0300db;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         */
        public static final int titleMargins=0x7f0300dc;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int titleTextAppearance=0x7f0300dd;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int titleTextColor=0x7f0300de;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int titleTextStyle=0x7f0300df;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int toolbarNavigationButtonStyle=0x7f0300e0;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int toolbarStyle=0x7f0300e1;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int track=0x7f0300e2;
        /**
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         */
        public static final int trackTint=0x7f0300e3;
        /**
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>add</td><td>10</td><td></td></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         */
        public static final int trackTintMode=0x7f0300e4;
        /**
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         */
        public static final int voiceIcon=0x7f0300e5;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int windowActionBar=0x7f0300e6;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int windowActionBarOverlay=0x7f0300e7;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int windowActionModeOverlay=0x7f0300e8;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         */
        public static final int windowFixedHeightMajor=0x7f0300e9;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         */
        public static final int windowFixedHeightMinor=0x7f0300ea;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         */
        public static final int windowFixedWidthMajor=0x7f0300eb;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         */
        public static final int windowFixedWidthMinor=0x7f0300ec;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         */
        public static final int windowMinWidthMajor=0x7f0300ed;
        /**
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         */
        public static final int windowMinWidthMinor=0x7f0300ee;
        /**
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         */
        public static final int windowNoTitle=0x7f0300ef;
      }
      public static final class bool {
        public static final int abc_action_bar_embed_tabs=0x7f040000;
        public static final int abc_allow_stacked_button_bar=0x7f040001;
        public static final int abc_config_actionMenuItemAllCaps=0x7f040002;
        public static final int abc_config_closeDialogWhenTouchOutside=0x7f040003;
        public static final int abc_config_showMenuShortcutsWhenKeyboardPresent=0x7f040004;
      }
      public static final class color {
        public static final int abc_background_cache_hint_selector_material_dark=0x7f050000;
        public static final int abc_background_cache_hint_selector_material_light=0x7f050001;
        public static final int abc_btn_colored_borderless_text_material=0x7f050002;
        public static final int abc_color_highlight_material=0x7f050003;
        public static final int abc_input_method_navigation_guard=0x7f050004;
        public static final int abc_primary_text_disable_only_material_dark=0x7f050005;
        public static final int abc_primary_text_disable_only_material_light=0x7f050006;
        public static final int abc_primary_text_material_dark=0x7f050007;
        public static final int abc_primary_text_material_light=0x7f050008;
        public static final int abc_search_url_text=0x7f050009;
        public static final int abc_search_url_text_normal=0x7f05000a;
        public static final int abc_search_url_text_pressed=0x7f05000b;
        public static final int abc_search_url_text_selected=0x7f05000c;
        public static final int abc_secondary_text_material_dark=0x7f05000d;
        public static final int abc_secondary_text_material_light=0x7f05000e;
        public static final int abc_tint_btn_checkable=0x7f05000f;
        public static final int abc_tint_default=0x7f050010;
        public static final int abc_tint_edittext=0x7f050011;
        public static final int abc_tint_seek_thumb=0x7f050012;
        public static final int abc_tint_spinner=0x7f050013;
        public static final int abc_tint_switch_thumb=0x7f050014;
        public static final int abc_tint_switch_track=0x7f050015;
        public static final int accent_material_dark=0x7f050016;
        public static final int accent_material_light=0x7f050017;
        public static final int background_floating_material_dark=0x7f050018;
        public static final int background_floating_material_light=0x7f050019;
        public static final int background_material_dark=0x7f05001a;
        public static final int background_material_light=0x7f05001b;
        public static final int black_54=0x7f05001c;
        public static final int black_87=0x7f05001d;
        public static final int bright_foreground_disabled_material_dark=0x7f05001e;
        public static final int bright_foreground_disabled_material_light=0x7f05001f;
        public static final int bright_foreground_inverse_material_dark=0x7f050020;
        public static final int bright_foreground_inverse_material_light=0x7f050021;
        public static final int bright_foreground_material_dark=0x7f050022;
        public static final int bright_foreground_material_light=0x7f050023;
        public static final int button_material_dark=0x7f050024;
        public static final int button_material_light=0x7f050025;
        public static final int cardview_dark_background=0x7f050026;
        public static final int cardview_light_background=0x7f050027;
        public static final int cardview_shadow_end_color=0x7f050028;
        public static final int cardview_shadow_start_color=0x7f050029;
        public static final int dim_foreground_disabled_material_dark=0x7f05002a;
        public static final int dim_foreground_disabled_material_light=0x7f05002b;
        public static final int dim_foreground_material_dark=0x7f05002c;
        public static final int dim_foreground_material_light=0x7f05002d;
        public static final int foreground_material_dark=0x7f05002e;
        public static final int foreground_material_light=0x7f05002f;
        public static final int highlighted_text_material_dark=0x7f050030;
        public static final int highlighted_text_material_light=0x7f050031;
        public static final int hint_foreground_material_dark=0x7f050032;
        public static final int hint_foreground_material_light=0x7f050033;
        public static final int material_blue_grey_800=0x7f050034;
        public static final int material_blue_grey_900=0x7f050035;
        public static final int material_blue_grey_950=0x7f050036;
        public static final int material_deep_teal_200=0x7f050037;
        public static final int material_deep_teal_500=0x7f050038;
        public static final int material_grey_100=0x7f050039;
        public static final int material_grey_300=0x7f05003a;
        public static final int material_grey_50=0x7f05003b;
        public static final int material_grey_600=0x7f05003c;
        public static final int material_grey_800=0x7f05003d;
        public static final int material_grey_850=0x7f05003e;
        public static final int material_grey_900=0x7f05003f;
        public static final int primary_dark_material_dark=0x7f050040;
        public static final int primary_dark_material_light=0x7f050041;
        public static final int primary_material_dark=0x7f050042;
        public static final int primary_material_light=0x7f050043;
        public static final int primary_text_default_material_dark=0x7f050044;
        public static final int primary_text_default_material_light=0x7f050045;
        public static final int primary_text_disabled_material_dark=0x7f050046;
        public static final int primary_text_disabled_material_light=0x7f050047;
        public static final int ripple_material_dark=0x7f050048;
        public static final int ripple_material_light=0x7f050049;
        public static final int secondary_text_default_material_dark=0x7f05004a;
        public static final int secondary_text_default_material_light=0x7f05004b;
        public static final int secondary_text_disabled_material_dark=0x7f05004c;
        public static final int secondary_text_disabled_material_light=0x7f05004d;
        public static final int switch_thumb_disabled_material_dark=0x7f05004e;
        public static final int switch_thumb_disabled_material_light=0x7f05004f;
        public static final int switch_thumb_material_dark=0x7f050050;
        public static final int switch_thumb_material_light=0x7f050051;
        public static final int switch_thumb_normal_material_dark=0x7f050052;
        public static final int switch_thumb_normal_material_light=0x7f050053;
        public static final int teal=0x7f050054;
      }
      public static final class dimen {
        public static final int abc_action_bar_content_inset_material=0x7f060000;
        public static final int abc_action_bar_content_inset_with_nav=0x7f060001;
        public static final int abc_action_bar_default_height_material=0x7f060002;
        public static final int abc_action_bar_default_padding_end_material=0x7f060003;
        public static final int abc_action_bar_default_padding_start_material=0x7f060004;
        public static final int abc_action_bar_icon_vertical_padding_material=0x7f060005;
        public static final int abc_action_bar_overflow_padding_end_material=0x7f060006;
        public static final int abc_action_bar_overflow_padding_start_material=0x7f060007;
        public static final int abc_action_bar_progress_bar_size=0x7f060008;
        public static final int abc_action_bar_stacked_max_height=0x7f060009;
        public static final int abc_action_bar_stacked_tab_max_width=0x7f06000a;
        public static final int abc_action_bar_subtitle_bottom_margin_material=0x7f06000b;
        public static final int abc_action_bar_subtitle_top_margin_material=0x7f06000c;
        public static final int abc_action_button_min_height_material=0x7f06000d;
        public static final int abc_action_button_min_width_material=0x7f06000e;
        public static final int abc_action_button_min_width_overflow_material=0x7f06000f;
        public static final int abc_alert_dialog_button_bar_height=0x7f060010;
        public static final int abc_button_inset_horizontal_material=0x7f060011;
        public static final int abc_button_inset_vertical_material=0x7f060012;
        public static final int abc_button_padding_horizontal_material=0x7f060013;
        public static final int abc_button_padding_vertical_material=0x7f060014;
        public static final int abc_cascading_menus_min_smallest_width=0x7f060015;
        public static final int abc_config_prefDialogWidth=0x7f060016;
        public static final int abc_control_corner_material=0x7f060017;
        public static final int abc_control_inset_material=0x7f060018;
        public static final int abc_control_padding_material=0x7f060019;
        public static final int abc_dialog_fixed_height_major=0x7f06001a;
        public static final int abc_dialog_fixed_height_minor=0x7f06001b;
        public static final int abc_dialog_fixed_width_major=0x7f06001c;
        public static final int abc_dialog_fixed_width_minor=0x7f06001d;
        public static final int abc_dialog_list_padding_vertical_material=0x7f06001e;
        public static final int abc_dialog_min_width_major=0x7f06001f;
        public static final int abc_dialog_min_width_minor=0x7f060020;
        public static final int abc_dialog_padding_material=0x7f060021;
        public static final int abc_dialog_padding_top_material=0x7f060022;
        public static final int abc_disabled_alpha_material_dark=0x7f060023;
        public static final int abc_disabled_alpha_material_light=0x7f060024;
        public static final int abc_dropdownitem_icon_width=0x7f060025;
        public static final int abc_dropdownitem_text_padding_left=0x7f060026;
        public static final int abc_dropdownitem_text_padding_right=0x7f060027;
        public static final int abc_edit_text_inset_bottom_material=0x7f060028;
        public static final int abc_edit_text_inset_horizontal_material=0x7f060029;
        public static final int abc_edit_text_inset_top_material=0x7f06002a;
        public static final int abc_floating_window_z=0x7f06002b;
        public static final int abc_list_item_padding_horizontal_material=0x7f06002c;
        public static final int abc_panel_menu_list_width=0x7f06002d;
        public static final int abc_progress_bar_height_material=0x7f06002e;
        public static final int abc_search_view_preferred_height=0x7f06002f;
        public static final int abc_search_view_preferred_width=0x7f060030;
        public static final int abc_seekbar_track_background_height_material=0x7f060031;
        public static final int abc_seekbar_track_progress_height_material=0x7f060032;
        public static final int abc_select_dialog_padding_start_material=0x7f060033;
        public static final int abc_switch_padding=0x7f060034;
        public static final int abc_text_size_body_1_material=0x7f060035;
        public static final int abc_text_size_body_2_material=0x7f060036;
        public static final int abc_text_size_button_material=0x7f060037;
        public static final int abc_text_size_caption_material=0x7f060038;
        public static final int abc_text_size_display_1_material=0x7f060039;
        public static final int abc_text_size_display_2_material=0x7f06003a;
        public static final int abc_text_size_display_3_material=0x7f06003b;
        public static final int abc_text_size_display_4_material=0x7f06003c;
        public static final int abc_text_size_headline_material=0x7f06003d;
        public static final int abc_text_size_large_material=0x7f06003e;
        public static final int abc_text_size_medium_material=0x7f06003f;
        public static final int abc_text_size_menu_header_material=0x7f060040;
        public static final int abc_text_size_menu_material=0x7f060041;
        public static final int abc_text_size_small_material=0x7f060042;
        public static final int abc_text_size_subhead_material=0x7f060043;
        public static final int abc_text_size_subtitle_material_toolbar=0x7f060044;
        public static final int abc_text_size_title_material=0x7f060045;
        public static final int abc_text_size_title_material_toolbar=0x7f060046;
        public static final int card_margin=0x7f060047;
        public static final int card_padding=0x7f060048;
        public static final int cardview_compat_inset_shadow=0x7f060049;
        public static final int cardview_default_elevation=0x7f06004a;
        public static final int cardview_default_radius=0x7f06004b;
        public static final int disabled_alpha_material_dark=0x7f06004c;
        public static final int disabled_alpha_material_light=0x7f06004d;
        public static final int highlight_alpha_material_colored=0x7f06004e;
        public static final int highlight_alpha_material_dark=0x7f06004f;
        public static final int highlight_alpha_material_light=0x7f060050;
        public static final int horizontal_page_margin=0x7f060051;
        public static final int item_touch_helper_max_drag_scroll_per_frame=0x7f060052;
        public static final int item_touch_helper_swipe_escape_max_velocity=0x7f060053;
        public static final int item_touch_helper_swipe_escape_velocity=0x7f060054;
        public static final int margin_huge=0x7f060055;
        public static final int margin_large=0x7f060056;
        public static final int margin_medium=0x7f060057;
        public static final int margin_small=0x7f060058;
        public static final int margin_tiny=0x7f060059;
        public static final int notification_large_icon_height=0x7f06005a;
        public static final int notification_large_icon_width=0x7f06005b;
        public static final int notification_subtext_size=0x7f06005c;
        public static final int vertical_page_margin=0x7f06005d;
      }
      public static final class drawable {
        public static final int abc_ab_share_pack_mtrl_alpha=0x7f070000;
        public static final int abc_action_bar_item_background_material=0x7f070001;
        public static final int abc_btn_borderless_material=0x7f070002;
        public static final int abc_btn_check_material=0x7f070003;
        public static final int abc_btn_check_to_on_mtrl_000=0x7f070004;
        public static final int abc_btn_check_to_on_mtrl_015=0x7f070005;
        public static final int abc_btn_colored_material=0x7f070006;
        public static final int abc_btn_default_mtrl_shape=0x7f070007;
        public static final int abc_btn_radio_material=0x7f070008;
        public static final int abc_btn_radio_to_on_mtrl_000=0x7f070009;
        public static final int abc_btn_radio_to_on_mtrl_015=0x7f07000a;
        public static final int abc_btn_switch_to_on_mtrl_00001=0x7f07000b;
        public static final int abc_btn_switch_to_on_mtrl_00012=0x7f07000c;
        public static final int abc_cab_background_internal_bg=0x7f07000d;
        public static final int abc_cab_background_top_material=0x7f07000e;
        public static final int abc_cab_background_top_mtrl_alpha=0x7f07000f;
        public static final int abc_control_background_material=0x7f070010;
        public static final int abc_dialog_material_background=0x7f070011;
        public static final int abc_edit_text_material=0x7f070012;
        public static final int abc_ic_ab_back_material=0x7f070013;
        public static final int abc_ic_arrow_drop_right_black_24dp=0x7f070014;
        public static final int abc_ic_clear_material=0x7f070015;
        public static final int abc_ic_commit_search_api_mtrl_alpha=0x7f070016;
        public static final int abc_ic_go_search_api_material=0x7f070017;
        public static final int abc_ic_menu_copy_mtrl_am_alpha=0x7f070018;
        public static final int abc_ic_menu_cut_mtrl_alpha=0x7f070019;
        public static final int abc_ic_menu_overflow_material=0x7f07001a;
        public static final int abc_ic_menu_paste_mtrl_am_alpha=0x7f07001b;
        public static final int abc_ic_menu_selectall_mtrl_alpha=0x7f07001c;
        public static final int abc_ic_menu_share_mtrl_alpha=0x7f07001d;
        public static final int abc_ic_search_api_material=0x7f07001e;
        public static final int abc_ic_star_black_16dp=0x7f07001f;
        public static final int abc_ic_star_black_36dp=0x7f070020;
        public static final int abc_ic_star_black_48dp=0x7f070021;
        public static final int abc_ic_star_half_black_16dp=0x7f070022;
        public static final int abc_ic_star_half_black_36dp=0x7f070023;
        public static final int abc_ic_star_half_black_48dp=0x7f070024;
        public static final int abc_ic_voice_search_api_material=0x7f070025;
        public static final int abc_item_background_holo_dark=0x7f070026;
        public static final int abc_item_background_holo_light=0x7f070027;
        public static final int abc_list_divider_mtrl_alpha=0x7f070028;
        public static final int abc_list_focused_holo=0x7f070029;
        public static final int abc_list_longpressed_holo=0x7f07002a;
        public static final int abc_list_pressed_holo_dark=0x7f07002b;
        public static final int abc_list_pressed_holo_light=0x7f07002c;
        public static final int abc_list_selector_background_transition_holo_dark=0x7f07002d;
        public static final int abc_list_selector_background_transition_holo_light=0x7f07002e;
        public static final int abc_list_selector_disabled_holo_dark=0x7f07002f;
        public static final int abc_list_selector_disabled_holo_light=0x7f070030;
        public static final int abc_list_selector_holo_dark=0x7f070031;
        public static final int abc_list_selector_holo_light=0x7f070032;
        public static final int abc_menu_hardkey_panel_mtrl_mult=0x7f070033;
        public static final int abc_popup_background_mtrl_mult=0x7f070034;
        public static final int abc_ratingbar_indicator_material=0x7f070035;
        public static final int abc_ratingbar_material=0x7f070036;
        public static final int abc_ratingbar_small_material=0x7f070037;
        public static final int abc_scrubber_control_off_mtrl_alpha=0x7f070038;
        public static final int abc_scrubber_control_to_pressed_mtrl_000=0x7f070039;
        public static final int abc_scrubber_control_to_pressed_mtrl_005=0x7f07003a;
        public static final int abc_scrubber_primary_mtrl_alpha=0x7f07003b;
        public static final int abc_scrubber_track_mtrl_alpha=0x7f07003c;
        public static final int abc_seekbar_thumb_material=0x7f07003d;
        public static final int abc_seekbar_tick_mark_material=0x7f07003e;
        public static final int abc_seekbar_track_material=0x7f07003f;
        public static final int abc_spinner_mtrl_am_alpha=0x7f070040;
        public static final int abc_spinner_textfield_background_material=0x7f070041;
        public static final int abc_switch_thumb_material=0x7f070042;
        public static final int abc_switch_track_mtrl_alpha=0x7f070043;
        public static final int abc_tab_indicator_material=0x7f070044;
        public static final int abc_tab_indicator_mtrl_alpha=0x7f070045;
        public static final int abc_text_cursor_material=0x7f070046;
        public static final int abc_textfield_activated_mtrl_alpha=0x7f070047;
        public static final int abc_textfield_default_mtrl_alpha=0x7f070048;
        public static final int abc_textfield_search_activated_mtrl_alpha=0x7f070049;
        public static final int abc_textfield_search_default_mtrl_alpha=0x7f07004a;
        public static final int abc_textfield_search_material=0x7f07004b;
        public static final int action_search=0x7f07004c;
        public static final int drawer_shadow=0x7f07004d;
        public static final int earth=0x7f07004e;
        public static final int ic_drawer=0x7f07004f;
        public static final int ic_launcher=0x7f070050;
        public static final int jupiter=0x7f070051;
        public static final int mars=0x7f070052;
        public static final int mercury=0x7f070053;
        public static final int neptune=0x7f070054;
        public static final int notification_template_icon_bg=0x7f070055;
        public static final int saturn=0x7f070056;
        public static final int tile=0x7f070057;
        public static final int uranus=0x7f070058;
        public static final int venus=0x7f070059;
      }
      public static final class id {
        public static final int action0=0x7f080000;
        public static final int action_bar=0x7f080001;
        public static final int action_bar_activity_content=0x7f080002;
        public static final int action_bar_container=0x7f080003;
        public static final int action_bar_root=0x7f080004;
        public static final int action_bar_spinner=0x7f080005;
        public static final int action_bar_subtitle=0x7f080006;
        public static final int action_bar_title=0x7f080007;
        public static final int action_context_bar=0x7f080008;
        public static final int action_divider=0x7f080009;
        public static final int action_menu_divider=0x7f08000a;
        public static final int action_menu_presenter=0x7f08000b;
        public static final int action_mode_bar=0x7f08000c;
        public static final int action_mode_bar_stub=0x7f08000d;
        public static final int action_mode_close_button=0x7f08000e;
        public static final int action_websearch=0x7f08000f;
        public static final int activity_chooser_view_content=0x7f080010;
        public static final int add=0x7f080011;
        public static final int alertTitle=0x7f080012;
        public static final int always=0x7f080013;
        public static final int beginning=0x7f080014;
        public static final int bottom=0x7f080015;
        public static final int buttonPanel=0x7f080016;
        public static final int cancel_action=0x7f080017;
        public static final int checkbox=0x7f080018;
        public static final int chronometer=0x7f080019;
        public static final int collapseActionView=0x7f08001a;
        public static final int contentPanel=0x7f08001b;
        public static final int content_frame=0x7f08001c;
        public static final int custom=0x7f08001d;
        public static final int customPanel=0x7f08001e;
        public static final int decor_content_parent=0x7f08001f;
        public static final int default_activity_button=0x7f080020;
        public static final int disableHome=0x7f080021;
        public static final int drawer_layout=0x7f080022;
        public static final int edit_query=0x7f080023;
        public static final int end=0x7f080024;
        public static final int end_padder=0x7f080025;
        public static final int expand_activities_button=0x7f080026;
        public static final int expanded_menu=0x7f080027;
        public static final int home=0x7f080028;
        public static final int homeAsUp=0x7f080029;
        public static final int icon=0x7f08002a;
        public static final int ifRoom=0x7f08002b;
        public static final int image=0x7f08002c;
        public static final int info=0x7f08002d;
        public static final int item_touch_helper_previous_elevation=0x7f08002e;
        public static final int left_drawer=0x7f08002f;
        public static final int line1=0x7f080030;
        public static final int line3=0x7f080031;
        public static final int listMode=0x7f080032;
        public static final int list_item=0x7f080033;
        public static final int media_actions=0x7f080034;
        public static final int middle=0x7f080035;
        public static final int multiply=0x7f080036;
        public static final int never=0x7f080037;
        public static final int none=0x7f080038;
        public static final int normal=0x7f080039;
        public static final int parentPanel=0x7f08003a;
        public static final int progress_circular=0x7f08003b;
        public static final int progress_horizontal=0x7f08003c;
        public static final int radio=0x7f08003d;
        public static final int screen=0x7f08003e;
        public static final int scrollIndicatorDown=0x7f08003f;
        public static final int scrollIndicatorUp=0x7f080040;
        public static final int scrollView=0x7f080041;
        public static final int search_badge=0x7f080042;
        public static final int search_bar=0x7f080043;
        public static final int search_button=0x7f080044;
        public static final int search_close_btn=0x7f080045;
        public static final int search_edit_frame=0x7f080046;
        public static final int search_go_btn=0x7f080047;
        public static final int search_mag_icon=0x7f080048;
        public static final int search_plate=0x7f080049;
        public static final int search_src_text=0x7f08004a;
        public static final int search_voice_btn=0x7f08004b;
        public static final int select_dialog_listview=0x7f08004c;
        public static final int shortcut=0x7f08004d;
        public static final int showCustom=0x7f08004e;
        public static final int showHome=0x7f08004f;
        public static final int showTitle=0x7f080050;
        public static final int spacer=0x7f080051;
        public static final int split_action_bar=0x7f080052;
        public static final int src_atop=0x7f080053;
        public static final int src_in=0x7f080054;
        public static final int src_over=0x7f080055;
        public static final int status_bar_latest_event_content=0x7f080056;
        public static final int submenuarrow=0x7f080057;
        public static final int submit_area=0x7f080058;
        public static final int tabMode=0x7f080059;
        public static final int text=0x7f08005a;
        public static final int text2=0x7f08005b;
        public static final int textSpacerNoButtons=0x7f08005c;
        public static final int time=0x7f08005d;
        public static final int title=0x7f08005e;
        public static final int title_template=0x7f08005f;
        public static final int top=0x7f080060;
        public static final int topPanel=0x7f080061;
        public static final int up=0x7f080062;
        public static final int useLogo=0x7f080063;
        public static final int withText=0x7f080064;
        public static final int wrap_content=0x7f080065;
      }
      public static final class integer {
        public static final int abc_config_activityDefaultDur=0x7f090000;
        public static final int abc_config_activityShortDur=0x7f090001;
        public static final int cancel_button_image_alpha=0x7f090002;
        public static final int status_bar_notification_info_maxnum=0x7f090003;
      }
      public static final class layout {
        public static final int abc_action_bar_title_item=0x7f0a0000;
        public static final int abc_action_bar_up_container=0x7f0a0001;
        public static final int abc_action_bar_view_list_nav_layout=0x7f0a0002;
        public static final int abc_action_menu_item_layout=0x7f0a0003;
        public static final int abc_action_menu_layout=0x7f0a0004;
        public static final int abc_action_mode_bar=0x7f0a0005;
        public static final int abc_action_mode_close_item_material=0x7f0a0006;
        public static final int abc_activity_chooser_view=0x7f0a0007;
        public static final int abc_activity_chooser_view_list_item=0x7f0a0008;
        public static final int abc_alert_dialog_button_bar_material=0x7f0a0009;
        public static final int abc_alert_dialog_material=0x7f0a000a;
        public static final int abc_dialog_title_material=0x7f0a000b;
        public static final int abc_expanded_menu_layout=0x7f0a000c;
        public static final int abc_list_menu_item_checkbox=0x7f0a000d;
        public static final int abc_list_menu_item_icon=0x7f0a000e;
        public static final int abc_list_menu_item_layout=0x7f0a000f;
        public static final int abc_list_menu_item_radio=0x7f0a0010;
        public static final int abc_popup_menu_header_item_layout=0x7f0a0011;
        public static final int abc_popup_menu_item_layout=0x7f0a0012;
        public static final int abc_screen_content_include=0x7f0a0013;
        public static final int abc_screen_simple=0x7f0a0014;
        public static final int abc_screen_simple_overlay_action_mode=0x7f0a0015;
        public static final int abc_screen_toolbar=0x7f0a0016;
        public static final int abc_search_dropdown_item_icons_2line=0x7f0a0017;
        public static final int abc_search_view=0x7f0a0018;
        public static final int abc_select_dialog_material=0x7f0a0019;
        public static final int activity_main=0x7f0a001a;
        public static final int activity_navigation_drawer=0x7f0a001b;
        public static final int drawer_list_item=0x7f0a001c;
        public static final int fragment_planet=0x7f0a001d;
        public static final int notification_media_action=0x7f0a001e;
        public static final int notification_media_cancel_action=0x7f0a001f;
        public static final int notification_template_big_media=0x7f0a0020;
        public static final int notification_template_big_media_narrow=0x7f0a0021;
        public static final int notification_template_lines=0x7f0a0022;
        public static final int notification_template_media=0x7f0a0023;
        public static final int notification_template_part_chronometer=0x7f0a0024;
        public static final int notification_template_part_time=0x7f0a0025;
        public static final int sample_dashboard_item=0x7f0a0026;
        public static final int select_dialog_item_material=0x7f0a0027;
        public static final int select_dialog_multichoice_material=0x7f0a0028;
        public static final int select_dialog_singlechoice_material=0x7f0a0029;
        public static final int support_simple_spinner_dropdown_item=0x7f0a002a;
      }
      public static final class menu {
        public static final int navigation_drawer=0x7f0b0000;
      }
      public static final class string {
        public static final int abc_action_bar_home_description=0x7f0c0000;
        public static final int abc_action_bar_home_description_format=0x7f0c0001;
        public static final int abc_action_bar_home_subtitle_description_format=0x7f0c0002;
        public static final int abc_action_bar_up_description=0x7f0c0003;
        public static final int abc_action_menu_overflow_description=0x7f0c0004;
        public static final int abc_action_mode_done=0x7f0c0005;
        public static final int abc_activity_chooser_view_see_all=0x7f0c0006;
        public static final int abc_activitychooserview_choose_application=0x7f0c0007;
        public static final int abc_capital_off=0x7f0c0008;
        public static final int abc_capital_on=0x7f0c0009;
        public static final int abc_font_family_body_1_material=0x7f0c000a;
        public static final int abc_font_family_body_2_material=0x7f0c000b;
        public static final int abc_font_family_button_material=0x7f0c000c;
        public static final int abc_font_family_caption_material=0x7f0c000d;
        public static final int abc_font_family_display_1_material=0x7f0c000e;
        public static final int abc_font_family_display_2_material=0x7f0c000f;
        public static final int abc_font_family_display_3_material=0x7f0c0010;
        public static final int abc_font_family_display_4_material=0x7f0c0011;
        public static final int abc_font_family_headline_material=0x7f0c0012;
        public static final int abc_font_family_menu_material=0x7f0c0013;
        public static final int abc_font_family_subhead_material=0x7f0c0014;
        public static final int abc_font_family_title_material=0x7f0c0015;
        public static final int abc_search_hint=0x7f0c0016;
        public static final int abc_searchview_description_clear=0x7f0c0017;
        public static final int abc_searchview_description_query=0x7f0c0018;
        public static final int abc_searchview_description_search=0x7f0c0019;
        public static final int abc_searchview_description_submit=0x7f0c001a;
        public static final int abc_searchview_description_voice=0x7f0c001b;
        public static final int abc_shareactionprovider_share_with=0x7f0c001c;
        public static final int abc_shareactionprovider_share_with_application=0x7f0c001d;
        public static final int abc_toolbar_collapse_description=0x7f0c001e;
        public static final int action_websearch=0x7f0c001f;
        public static final int app_name=0x7f0c0020;
        public static final int app_not_available=0x7f0c0021;
        public static final int drawer_close=0x7f0c0022;
        public static final int drawer_open=0x7f0c0023;
        public static final int intro_message=0x7f0c0024;
        public static final int navigationdraweractivity_description=0x7f0c0025;
        public static final int navigationdraweractivity_title=0x7f0c0026;
        public static final int status_bar_notification_info_overflow=0x7f0c0027;
      }
      public static final class style {
        public static final int AlertDialog_AppCompat=0x7f0d0000;
        public static final int AlertDialog_AppCompat_Light=0x7f0d0001;
        public static final int Animation_AppCompat_Dialog=0x7f0d0002;
        public static final int Animation_AppCompat_DropDownUp=0x7f0d0003;
        public static final int AppTheme=0x7f0d0004;
        public static final int Base_AlertDialog_AppCompat=0x7f0d0005;
        public static final int Base_AlertDialog_AppCompat_Light=0x7f0d0006;
        public static final int Base_Animation_AppCompat_Dialog=0x7f0d0007;
        public static final int Base_Animation_AppCompat_DropDownUp=0x7f0d0008;
        public static final int Base_CardView=0x7f0d0009;
        public static final int Base_DialogWindowTitle_AppCompat=0x7f0d000a;
        public static final int Base_DialogWindowTitleBackground_AppCompat=0x7f0d000b;
        public static final int Base_TextAppearance_AppCompat=0x7f0d000c;
        public static final int Base_TextAppearance_AppCompat_Body1=0x7f0d000d;
        public static final int Base_TextAppearance_AppCompat_Body2=0x7f0d000e;
        public static final int Base_TextAppearance_AppCompat_Button=0x7f0d000f;
        public static final int Base_TextAppearance_AppCompat_Caption=0x7f0d0010;
        public static final int Base_TextAppearance_AppCompat_Display1=0x7f0d0011;
        public static final int Base_TextAppearance_AppCompat_Display2=0x7f0d0012;
        public static final int Base_TextAppearance_AppCompat_Display3=0x7f0d0013;
        public static final int Base_TextAppearance_AppCompat_Display4=0x7f0d0014;
        public static final int Base_TextAppearance_AppCompat_Headline=0x7f0d0015;
        public static final int Base_TextAppearance_AppCompat_Inverse=0x7f0d0016;
        public static final int Base_TextAppearance_AppCompat_Large=0x7f0d0017;
        public static final int Base_TextAppearance_AppCompat_Large_Inverse=0x7f0d0018;
        public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Large=0x7f0d0019;
        public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Small=0x7f0d001a;
        public static final int Base_TextAppearance_AppCompat_Medium=0x7f0d001b;
        public static final int Base_TextAppearance_AppCompat_Medium_Inverse=0x7f0d001c;
        public static final int Base_TextAppearance_AppCompat_Menu=0x7f0d001d;
        public static final int Base_TextAppearance_AppCompat_SearchResult=0x7f0d001e;
        public static final int Base_TextAppearance_AppCompat_SearchResult_Subtitle=0x7f0d001f;
        public static final int Base_TextAppearance_AppCompat_SearchResult_Title=0x7f0d0020;
        public static final int Base_TextAppearance_AppCompat_Small=0x7f0d0021;
        public static final int Base_TextAppearance_AppCompat_Small_Inverse=0x7f0d0022;
        public static final int Base_TextAppearance_AppCompat_Subhead=0x7f0d0023;
        public static final int Base_TextAppearance_AppCompat_Subhead_Inverse=0x7f0d0024;
        public static final int Base_TextAppearance_AppCompat_Title=0x7f0d0025;
        public static final int Base_TextAppearance_AppCompat_Title_Inverse=0x7f0d0026;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Menu=0x7f0d0027;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle=0x7f0d0028;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse=0x7f0d0029;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title=0x7f0d002a;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse=0x7f0d002b;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Subtitle=0x7f0d002c;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Title=0x7f0d002d;
        public static final int Base_TextAppearance_AppCompat_Widget_Button=0x7f0d002e;
        public static final int Base_TextAppearance_AppCompat_Widget_Button_Inverse=0x7f0d002f;
        public static final int Base_TextAppearance_AppCompat_Widget_DropDownItem=0x7f0d0030;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Header=0x7f0d0031;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Large=0x7f0d0032;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Small=0x7f0d0033;
        public static final int Base_TextAppearance_AppCompat_Widget_Switch=0x7f0d0034;
        public static final int Base_TextAppearance_AppCompat_Widget_TextView_SpinnerItem=0x7f0d0035;
        public static final int Base_TextAppearance_Widget_AppCompat_ExpandedMenu_Item=0x7f0d0036;
        public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Subtitle=0x7f0d0037;
        public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Title=0x7f0d0038;
        public static final int Base_Theme_AppCompat=0x7f0d0039;
        public static final int Base_Theme_AppCompat_CompactMenu=0x7f0d003a;
        public static final int Base_Theme_AppCompat_Dialog=0x7f0d003b;
        public static final int Base_Theme_AppCompat_Dialog_Alert=0x7f0d003c;
        public static final int Base_Theme_AppCompat_Dialog_FixedSize=0x7f0d003d;
        public static final int Base_Theme_AppCompat_Dialog_MinWidth=0x7f0d003e;
        public static final int Base_Theme_AppCompat_DialogWhenLarge=0x7f0d003f;
        public static final int Base_Theme_AppCompat_Light=0x7f0d0040;
        public static final int Base_Theme_AppCompat_Light_DarkActionBar=0x7f0d0041;
        public static final int Base_Theme_AppCompat_Light_Dialog=0x7f0d0042;
        public static final int Base_Theme_AppCompat_Light_Dialog_Alert=0x7f0d0043;
        public static final int Base_Theme_AppCompat_Light_Dialog_FixedSize=0x7f0d0044;
        public static final int Base_Theme_AppCompat_Light_Dialog_MinWidth=0x7f0d0045;
        public static final int Base_Theme_AppCompat_Light_DialogWhenLarge=0x7f0d0046;
        public static final int Base_ThemeOverlay_AppCompat=0x7f0d0047;
        public static final int Base_ThemeOverlay_AppCompat_ActionBar=0x7f0d0048;
        public static final int Base_ThemeOverlay_AppCompat_Dark=0x7f0d0049;
        public static final int Base_ThemeOverlay_AppCompat_Dark_ActionBar=0x7f0d004a;
        public static final int Base_ThemeOverlay_AppCompat_Dialog=0x7f0d004b;
        public static final int Base_ThemeOverlay_AppCompat_Dialog_Alert=0x7f0d004c;
        public static final int Base_ThemeOverlay_AppCompat_Light=0x7f0d004d;
        public static final int Base_V11_Theme_AppCompat_Dialog=0x7f0d004e;
        public static final int Base_V11_Theme_AppCompat_Light_Dialog=0x7f0d004f;
        public static final int Base_V11_ThemeOverlay_AppCompat_Dialog=0x7f0d0050;
        public static final int Base_V12_Widget_AppCompat_AutoCompleteTextView=0x7f0d0051;
        public static final int Base_V12_Widget_AppCompat_EditText=0x7f0d0052;
        public static final int Base_V21_Theme_AppCompat=0x7f0d0053;
        public static final int Base_V21_Theme_AppCompat_Dialog=0x7f0d0054;
        public static final int Base_V21_Theme_AppCompat_Light=0x7f0d0055;
        public static final int Base_V21_Theme_AppCompat_Light_Dialog=0x7f0d0056;
        public static final int Base_V21_ThemeOverlay_AppCompat_Dialog=0x7f0d0057;
        public static final int Base_V22_Theme_AppCompat=0x7f0d0058;
        public static final int Base_V22_Theme_AppCompat_Light=0x7f0d0059;
        public static final int Base_V23_Theme_AppCompat=0x7f0d005a;
        public static final int Base_V23_Theme_AppCompat_Light=0x7f0d005b;
        public static final int Base_V7_Theme_AppCompat=0x7f0d005c;
        public static final int Base_V7_Theme_AppCompat_Dialog=0x7f0d005d;
        public static final int Base_V7_Theme_AppCompat_Light=0x7f0d005e;
        public static final int Base_V7_Theme_AppCompat_Light_Dialog=0x7f0d005f;
        public static final int Base_V7_ThemeOverlay_AppCompat_Dialog=0x7f0d0060;
        public static final int Base_V7_Widget_AppCompat_AutoCompleteTextView=0x7f0d0061;
        public static final int Base_V7_Widget_AppCompat_EditText=0x7f0d0062;
        public static final int Base_Widget_AppCompat_ActionBar=0x7f0d0063;
        public static final int Base_Widget_AppCompat_ActionBar_Solid=0x7f0d0064;
        public static final int Base_Widget_AppCompat_ActionBar_TabBar=0x7f0d0065;
        public static final int Base_Widget_AppCompat_ActionBar_TabText=0x7f0d0066;
        public static final int Base_Widget_AppCompat_ActionBar_TabView=0x7f0d0067;
        public static final int Base_Widget_AppCompat_ActionButton=0x7f0d0068;
        public static final int Base_Widget_AppCompat_ActionButton_CloseMode=0x7f0d0069;
        public static final int Base_Widget_AppCompat_ActionButton_Overflow=0x7f0d006a;
        public static final int Base_Widget_AppCompat_ActionMode=0x7f0d006b;
        public static final int Base_Widget_AppCompat_ActivityChooserView=0x7f0d006c;
        public static final int Base_Widget_AppCompat_AutoCompleteTextView=0x7f0d006d;
        public static final int Base_Widget_AppCompat_Button=0x7f0d006e;
        public static final int Base_Widget_AppCompat_Button_Borderless=0x7f0d006f;
        public static final int Base_Widget_AppCompat_Button_Borderless_Colored=0x7f0d0070;
        public static final int Base_Widget_AppCompat_Button_ButtonBar_AlertDialog=0x7f0d0071;
        public static final int Base_Widget_AppCompat_Button_Colored=0x7f0d0072;
        public static final int Base_Widget_AppCompat_Button_Small=0x7f0d0073;
        public static final int Base_Widget_AppCompat_ButtonBar=0x7f0d0074;
        public static final int Base_Widget_AppCompat_ButtonBar_AlertDialog=0x7f0d0075;
        public static final int Base_Widget_AppCompat_CompoundButton_CheckBox=0x7f0d0076;
        public static final int Base_Widget_AppCompat_CompoundButton_RadioButton=0x7f0d0077;
        public static final int Base_Widget_AppCompat_CompoundButton_Switch=0x7f0d0078;
        public static final int Base_Widget_AppCompat_DrawerArrowToggle=0x7f0d0079;
        public static final int Base_Widget_AppCompat_DrawerArrowToggle_Common=0x7f0d007a;
        public static final int Base_Widget_AppCompat_DropDownItem_Spinner=0x7f0d007b;
        public static final int Base_Widget_AppCompat_EditText=0x7f0d007c;
        public static final int Base_Widget_AppCompat_ImageButton=0x7f0d007d;
        public static final int Base_Widget_AppCompat_Light_ActionBar=0x7f0d007e;
        public static final int Base_Widget_AppCompat_Light_ActionBar_Solid=0x7f0d007f;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabBar=0x7f0d0080;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabText=0x7f0d0081;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabText_Inverse=0x7f0d0082;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabView=0x7f0d0083;
        public static final int Base_Widget_AppCompat_Light_PopupMenu=0x7f0d0084;
        public static final int Base_Widget_AppCompat_Light_PopupMenu_Overflow=0x7f0d0085;
        public static final int Base_Widget_AppCompat_ListMenuView=0x7f0d0086;
        public static final int Base_Widget_AppCompat_ListPopupWindow=0x7f0d0087;
        public static final int Base_Widget_AppCompat_ListView=0x7f0d0088;
        public static final int Base_Widget_AppCompat_ListView_DropDown=0x7f0d0089;
        public static final int Base_Widget_AppCompat_ListView_Menu=0x7f0d008a;
        public static final int Base_Widget_AppCompat_PopupMenu=0x7f0d008b;
        public static final int Base_Widget_AppCompat_PopupMenu_Overflow=0x7f0d008c;
        public static final int Base_Widget_AppCompat_PopupWindow=0x7f0d008d;
        public static final int Base_Widget_AppCompat_ProgressBar=0x7f0d008e;
        public static final int Base_Widget_AppCompat_ProgressBar_Horizontal=0x7f0d008f;
        public static final int Base_Widget_AppCompat_RatingBar=0x7f0d0090;
        public static final int Base_Widget_AppCompat_RatingBar_Indicator=0x7f0d0091;
        public static final int Base_Widget_AppCompat_RatingBar_Small=0x7f0d0092;
        public static final int Base_Widget_AppCompat_SearchView=0x7f0d0093;
        public static final int Base_Widget_AppCompat_SearchView_ActionBar=0x7f0d0094;
        public static final int Base_Widget_AppCompat_SeekBar=0x7f0d0095;
        public static final int Base_Widget_AppCompat_SeekBar_Discrete=0x7f0d0096;
        public static final int Base_Widget_AppCompat_Spinner=0x7f0d0097;
        public static final int Base_Widget_AppCompat_Spinner_Underlined=0x7f0d0098;
        public static final int Base_Widget_AppCompat_TextView_SpinnerItem=0x7f0d0099;
        public static final int Base_Widget_AppCompat_Toolbar=0x7f0d009a;
        public static final int Base_Widget_AppCompat_Toolbar_Button_Navigation=0x7f0d009b;
        public static final int CardView=0x7f0d009c;
        public static final int CardView_Dark=0x7f0d009d;
        public static final int CardView_Light=0x7f0d009e;
        public static final int Platform_AppCompat=0x7f0d009f;
        public static final int Platform_AppCompat_Light=0x7f0d00a0;
        public static final int Platform_ThemeOverlay_AppCompat=0x7f0d00a1;
        public static final int Platform_ThemeOverlay_AppCompat_Dark=0x7f0d00a2;
        public static final int Platform_ThemeOverlay_AppCompat_Light=0x7f0d00a3;
        public static final int Platform_V11_AppCompat=0x7f0d00a4;
        public static final int Platform_V11_AppCompat_Light=0x7f0d00a5;
        public static final int Platform_V14_AppCompat=0x7f0d00a6;
        public static final int Platform_V14_AppCompat_Light=0x7f0d00a7;
        public static final int Platform_Widget_AppCompat_Spinner=0x7f0d00a8;
        public static final int RtlOverlay_DialogWindowTitle_AppCompat=0x7f0d00a9;
        public static final int RtlOverlay_Widget_AppCompat_ActionBar_TitleItem=0x7f0d00aa;
        public static final int RtlOverlay_Widget_AppCompat_DialogTitle_Icon=0x7f0d00ab;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem=0x7f0d00ac;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_InternalGroup=0x7f0d00ad;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Text=0x7f0d00ae;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown=0x7f0d00af;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon1=0x7f0d00b0;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon2=0x7f0d00b1;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Query=0x7f0d00b2;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Text=0x7f0d00b3;
        public static final int RtlOverlay_Widget_AppCompat_SearchView_MagIcon=0x7f0d00b4;
        public static final int RtlUnderlay_Widget_AppCompat_ActionButton=0x7f0d00b5;
        public static final int RtlUnderlay_Widget_AppCompat_ActionButton_Overflow=0x7f0d00b6;
        public static final int TextAppearance_AppCompat=0x7f0d00b7;
        public static final int TextAppearance_AppCompat_Body1=0x7f0d00b8;
        public static final int TextAppearance_AppCompat_Body2=0x7f0d00b9;
        public static final int TextAppearance_AppCompat_Button=0x7f0d00ba;
        public static final int TextAppearance_AppCompat_Caption=0x7f0d00bb;
        public static final int TextAppearance_AppCompat_Display1=0x7f0d00bc;
        public static final int TextAppearance_AppCompat_Display2=0x7f0d00bd;
        public static final int TextAppearance_AppCompat_Display3=0x7f0d00be;
        public static final int TextAppearance_AppCompat_Display4=0x7f0d00bf;
        public static final int TextAppearance_AppCompat_Headline=0x7f0d00c0;
        public static final int TextAppearance_AppCompat_Inverse=0x7f0d00c1;
        public static final int TextAppearance_AppCompat_Large=0x7f0d00c2;
        public static final int TextAppearance_AppCompat_Large_Inverse=0x7f0d00c3;
        public static final int TextAppearance_AppCompat_Light_SearchResult_Subtitle=0x7f0d00c4;
        public static final int TextAppearance_AppCompat_Light_SearchResult_Title=0x7f0d00c5;
        public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Large=0x7f0d00c6;
        public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Small=0x7f0d00c7;
        public static final int TextAppearance_AppCompat_Medium=0x7f0d00c8;
        public static final int TextAppearance_AppCompat_Medium_Inverse=0x7f0d00c9;
        public static final int TextAppearance_AppCompat_Menu=0x7f0d00ca;
        public static final int TextAppearance_AppCompat_SearchResult_Subtitle=0x7f0d00cb;
        public static final int TextAppearance_AppCompat_SearchResult_Title=0x7f0d00cc;
        public static final int TextAppearance_AppCompat_Small=0x7f0d00cd;
        public static final int TextAppearance_AppCompat_Small_Inverse=0x7f0d00ce;
        public static final int TextAppearance_AppCompat_Subhead=0x7f0d00cf;
        public static final int TextAppearance_AppCompat_Subhead_Inverse=0x7f0d00d0;
        public static final int TextAppearance_AppCompat_Title=0x7f0d00d1;
        public static final int TextAppearance_AppCompat_Title_Inverse=0x7f0d00d2;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Menu=0x7f0d00d3;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle=0x7f0d00d4;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse=0x7f0d00d5;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Title=0x7f0d00d6;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse=0x7f0d00d7;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle=0x7f0d00d8;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle_Inverse=0x7f0d00d9;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Title=0x7f0d00da;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Title_Inverse=0x7f0d00db;
        public static final int TextAppearance_AppCompat_Widget_Button=0x7f0d00dc;
        public static final int TextAppearance_AppCompat_Widget_Button_Inverse=0x7f0d00dd;
        public static final int TextAppearance_AppCompat_Widget_DropDownItem=0x7f0d00de;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Header=0x7f0d00df;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Large=0x7f0d00e0;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Small=0x7f0d00e1;
        public static final int TextAppearance_AppCompat_Widget_Switch=0x7f0d00e2;
        public static final int TextAppearance_AppCompat_Widget_TextView_SpinnerItem=0x7f0d00e3;
        public static final int TextAppearance_StatusBar_EventContent=0x7f0d00e4;
        public static final int TextAppearance_StatusBar_EventContent_Info=0x7f0d00e5;
        public static final int TextAppearance_StatusBar_EventContent_Line2=0x7f0d00e6;
        public static final int TextAppearance_StatusBar_EventContent_Time=0x7f0d00e7;
        public static final int TextAppearance_StatusBar_EventContent_Title=0x7f0d00e8;
        public static final int TextAppearance_Widget_AppCompat_ExpandedMenu_Item=0x7f0d00e9;
        public static final int TextAppearance_Widget_AppCompat_Toolbar_Subtitle=0x7f0d00ea;
        public static final int TextAppearance_Widget_AppCompat_Toolbar_Title=0x7f0d00eb;
        public static final int Theme_AppCompat=0x7f0d00ec;
        public static final int Theme_AppCompat_CompactMenu=0x7f0d00ed;
        public static final int Theme_AppCompat_DayNight=0x7f0d00ee;
        public static final int Theme_AppCompat_DayNight_DarkActionBar=0x7f0d00ef;
        public static final int Theme_AppCompat_DayNight_Dialog=0x7f0d00f0;
        public static final int Theme_AppCompat_DayNight_Dialog_Alert=0x7f0d00f1;
        public static final int Theme_AppCompat_DayNight_Dialog_MinWidth=0x7f0d00f2;
        public static final int Theme_AppCompat_DayNight_DialogWhenLarge=0x7f0d00f3;
        public static final int Theme_AppCompat_DayNight_NoActionBar=0x7f0d00f4;
        public static final int Theme_AppCompat_Dialog=0x7f0d00f5;
        public static final int Theme_AppCompat_Dialog_Alert=0x7f0d00f6;
        public static final int Theme_AppCompat_Dialog_MinWidth=0x7f0d00f7;
        public static final int Theme_AppCompat_DialogWhenLarge=0x7f0d00f8;
        public static final int Theme_AppCompat_Light=0x7f0d00f9;
        public static final int Theme_AppCompat_Light_DarkActionBar=0x7f0d00fa;
        public static final int Theme_AppCompat_Light_Dialog=0x7f0d00fb;
        public static final int Theme_AppCompat_Light_Dialog_Alert=0x7f0d00fc;
        public static final int Theme_AppCompat_Light_Dialog_MinWidth=0x7f0d00fd;
        public static final int Theme_AppCompat_Light_DialogWhenLarge=0x7f0d00fe;
        public static final int Theme_AppCompat_Light_NoActionBar=0x7f0d00ff;
        public static final int Theme_AppCompat_NoActionBar=0x7f0d0100;
        public static final int Theme_Base=0x7f0d0101;
        public static final int Theme_Sample=0x7f0d0102;
        public static final int ThemeOverlay_AppCompat=0x7f0d0103;
        public static final int ThemeOverlay_AppCompat_ActionBar=0x7f0d0104;
        public static final int ThemeOverlay_AppCompat_Dark=0x7f0d0105;
        public static final int ThemeOverlay_AppCompat_Dark_ActionBar=0x7f0d0106;
        public static final int ThemeOverlay_AppCompat_Dialog=0x7f0d0107;
        public static final int ThemeOverlay_AppCompat_Dialog_Alert=0x7f0d0108;
        public static final int ThemeOverlay_AppCompat_Light=0x7f0d0109;
        public static final int Widget=0x7f0d010a;
        public static final int Widget_AppCompat_ActionBar=0x7f0d010b;
        public static final int Widget_AppCompat_ActionBar_Solid=0x7f0d010c;
        public static final int Widget_AppCompat_ActionBar_TabBar=0x7f0d010d;
        public static final int Widget_AppCompat_ActionBar_TabText=0x7f0d010e;
        public static final int Widget_AppCompat_ActionBar_TabView=0x7f0d010f;
        public static final int Widget_AppCompat_ActionButton=0x7f0d0110;
        public static final int Widget_AppCompat_ActionButton_CloseMode=0x7f0d0111;
        public static final int Widget_AppCompat_ActionButton_Overflow=0x7f0d0112;
        public static final int Widget_AppCompat_ActionMode=0x7f0d0113;
        public static final int Widget_AppCompat_ActivityChooserView=0x7f0d0114;
        public static final int Widget_AppCompat_AutoCompleteTextView=0x7f0d0115;
        public static final int Widget_AppCompat_Button=0x7f0d0116;
        public static final int Widget_AppCompat_Button_Borderless=0x7f0d0117;
        public static final int Widget_AppCompat_Button_Borderless_Colored=0x7f0d0118;
        public static final int Widget_AppCompat_Button_ButtonBar_AlertDialog=0x7f0d0119;
        public static final int Widget_AppCompat_Button_Colored=0x7f0d011a;
        public static final int Widget_AppCompat_Button_Small=0x7f0d011b;
        public static final int Widget_AppCompat_ButtonBar=0x7f0d011c;
        public static final int Widget_AppCompat_ButtonBar_AlertDialog=0x7f0d011d;
        public static final int Widget_AppCompat_CompoundButton_CheckBox=0x7f0d011e;
        public static final int Widget_AppCompat_CompoundButton_RadioButton=0x7f0d011f;
        public static final int Widget_AppCompat_CompoundButton_Switch=0x7f0d0120;
        public static final int Widget_AppCompat_DrawerArrowToggle=0x7f0d0121;
        public static final int Widget_AppCompat_DropDownItem_Spinner=0x7f0d0122;
        public static final int Widget_AppCompat_EditText=0x7f0d0123;
        public static final int Widget_AppCompat_ImageButton=0x7f0d0124;
        public static final int Widget_AppCompat_Light_ActionBar=0x7f0d0125;
        public static final int Widget_AppCompat_Light_ActionBar_Solid=0x7f0d0126;
        public static final int Widget_AppCompat_Light_ActionBar_Solid_Inverse=0x7f0d0127;
        public static final int Widget_AppCompat_Light_ActionBar_TabBar=0x7f0d0128;
        public static final int Widget_AppCompat_Light_ActionBar_TabBar_Inverse=0x7f0d0129;
        public static final int Widget_AppCompat_Light_ActionBar_TabText=0x7f0d012a;
        public static final int Widget_AppCompat_Light_ActionBar_TabText_Inverse=0x7f0d012b;
        public static final int Widget_AppCompat_Light_ActionBar_TabView=0x7f0d012c;
        public static final int Widget_AppCompat_Light_ActionBar_TabView_Inverse=0x7f0d012d;
        public static final int Widget_AppCompat_Light_ActionButton=0x7f0d012e;
        public static final int Widget_AppCompat_Light_ActionButton_CloseMode=0x7f0d012f;
        public static final int Widget_AppCompat_Light_ActionButton_Overflow=0x7f0d0130;
        public static final int Widget_AppCompat_Light_ActionMode_Inverse=0x7f0d0131;
        public static final int Widget_AppCompat_Light_ActivityChooserView=0x7f0d0132;
        public static final int Widget_AppCompat_Light_AutoCompleteTextView=0x7f0d0133;
        public static final int Widget_AppCompat_Light_DropDownItem_Spinner=0x7f0d0134;
        public static final int Widget_AppCompat_Light_ListPopupWindow=0x7f0d0135;
        public static final int Widget_AppCompat_Light_ListView_DropDown=0x7f0d0136;
        public static final int Widget_AppCompat_Light_PopupMenu=0x7f0d0137;
        public static final int Widget_AppCompat_Light_PopupMenu_Overflow=0x7f0d0138;
        public static final int Widget_AppCompat_Light_SearchView=0x7f0d0139;
        public static final int Widget_AppCompat_Light_Spinner_DropDown_ActionBar=0x7f0d013a;
        public static final int Widget_AppCompat_ListMenuView=0x7f0d013b;
        public static final int Widget_AppCompat_ListPopupWindow=0x7f0d013c;
        public static final int Widget_AppCompat_ListView=0x7f0d013d;
        public static final int Widget_AppCompat_ListView_DropDown=0x7f0d013e;
        public static final int Widget_AppCompat_ListView_Menu=0x7f0d013f;
        public static final int Widget_AppCompat_PopupMenu=0x7f0d0140;
        public static final int Widget_AppCompat_PopupMenu_Overflow=0x7f0d0141;
        public static final int Widget_AppCompat_PopupWindow=0x7f0d0142;
        public static final int Widget_AppCompat_ProgressBar=0x7f0d0143;
        public static final int Widget_AppCompat_ProgressBar_Horizontal=0x7f0d0144;
        public static final int Widget_AppCompat_RatingBar=0x7f0d0145;
        public static final int Widget_AppCompat_RatingBar_Indicator=0x7f0d0146;
        public static final int Widget_AppCompat_RatingBar_Small=0x7f0d0147;
        public static final int Widget_AppCompat_SearchView=0x7f0d0148;
        public static final int Widget_AppCompat_SearchView_ActionBar=0x7f0d0149;
        public static final int Widget_AppCompat_SeekBar=0x7f0d014a;
        public static final int Widget_AppCompat_SeekBar_Discrete=0x7f0d014b;
        public static final int Widget_AppCompat_Spinner=0x7f0d014c;
        public static final int Widget_AppCompat_Spinner_DropDown=0x7f0d014d;
        public static final int Widget_AppCompat_Spinner_DropDown_ActionBar=0x7f0d014e;
        public static final int Widget_AppCompat_Spinner_Underlined=0x7f0d014f;
        public static final int Widget_AppCompat_TextView_SpinnerItem=0x7f0d0150;
        public static final int Widget_AppCompat_Toolbar=0x7f0d0151;
        public static final int Widget_AppCompat_Toolbar_Button_Navigation=0x7f0d0152;
        public static final int Widget_SampleContentContainer=0x7f0d0153;
        public static final int Widget_SampleDashboard_Card=0x7f0d0154;
        public static final int Widget_SampleDashboard_Grid=0x7f0d0155;
        public static final int Widget_SampleDashboard_Item=0x7f0d0156;
        public static final int Widget_SampleDashboard_Item_Description=0x7f0d0157;
        public static final int Widget_SampleDashboard_Item_Title=0x7f0d0158;
        public static final int Widget_SampleMessage=0x7f0d0159;
      }
      public static final class styleable {
        /**
         * Attributes that can be used with a ActionBar.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ActionBar_background com.mealplanner.navigationdrawer:background}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_backgroundSplit com.mealplanner.navigationdrawer:backgroundSplit}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_backgroundStacked com.mealplanner.navigationdrawer:backgroundStacked}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_contentInsetEnd com.mealplanner.navigationdrawer:contentInsetEnd}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_contentInsetEndWithActions com.mealplanner.navigationdrawer:contentInsetEndWithActions}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_contentInsetLeft com.mealplanner.navigationdrawer:contentInsetLeft}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_contentInsetRight com.mealplanner.navigationdrawer:contentInsetRight}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_contentInsetStart com.mealplanner.navigationdrawer:contentInsetStart}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_contentInsetStartWithNavigation com.mealplanner.navigationdrawer:contentInsetStartWithNavigation}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_customNavigationLayout com.mealplanner.navigationdrawer:customNavigationLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_displayOptions com.mealplanner.navigationdrawer:displayOptions}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_divider com.mealplanner.navigationdrawer:divider}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_elevation com.mealplanner.navigationdrawer:elevation}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_height com.mealplanner.navigationdrawer:height}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_hideOnContentScroll com.mealplanner.navigationdrawer:hideOnContentScroll}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_homeAsUpIndicator com.mealplanner.navigationdrawer:homeAsUpIndicator}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_homeLayout com.mealplanner.navigationdrawer:homeLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_icon com.mealplanner.navigationdrawer:icon}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_indeterminateProgressStyle com.mealplanner.navigationdrawer:indeterminateProgressStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_itemPadding com.mealplanner.navigationdrawer:itemPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_logo com.mealplanner.navigationdrawer:logo}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_navigationMode com.mealplanner.navigationdrawer:navigationMode}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_popupTheme com.mealplanner.navigationdrawer:popupTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_progressBarPadding com.mealplanner.navigationdrawer:progressBarPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_progressBarStyle com.mealplanner.navigationdrawer:progressBarStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_subtitle com.mealplanner.navigationdrawer:subtitle}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_subtitleTextStyle com.mealplanner.navigationdrawer:subtitleTextStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_title com.mealplanner.navigationdrawer:title}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionBar_titleTextStyle com.mealplanner.navigationdrawer:titleTextStyle}</code></td><td></td></tr>
         * </table>
         * @see #ActionBar_background
         * @see #ActionBar_backgroundSplit
         * @see #ActionBar_backgroundStacked
         * @see #ActionBar_contentInsetEnd
         * @see #ActionBar_contentInsetEndWithActions
         * @see #ActionBar_contentInsetLeft
         * @see #ActionBar_contentInsetRight
         * @see #ActionBar_contentInsetStart
         * @see #ActionBar_contentInsetStartWithNavigation
         * @see #ActionBar_customNavigationLayout
         * @see #ActionBar_displayOptions
         * @see #ActionBar_divider
         * @see #ActionBar_elevation
         * @see #ActionBar_height
         * @see #ActionBar_hideOnContentScroll
         * @see #ActionBar_homeAsUpIndicator
         * @see #ActionBar_homeLayout
         * @see #ActionBar_icon
         * @see #ActionBar_indeterminateProgressStyle
         * @see #ActionBar_itemPadding
         * @see #ActionBar_logo
         * @see #ActionBar_navigationMode
         * @see #ActionBar_popupTheme
         * @see #ActionBar_progressBarPadding
         * @see #ActionBar_progressBarStyle
         * @see #ActionBar_subtitle
         * @see #ActionBar_subtitleTextStyle
         * @see #ActionBar_title
         * @see #ActionBar_titleTextStyle
         */
        public static final int[] ActionBar={
            0x7f03002b, 0x7f03002c, 0x7f03002d, 0x7f030054,
            0x7f030055, 0x7f030056, 0x7f030057, 0x7f030058,
            0x7f030059, 0x7f030060, 0x7f030064, 0x7f030065,
            0x7f030070, 0x7f030074, 0x7f030075, 0x7f030076,
            0x7f030077, 0x7f030078, 0x7f03007b, 0x7f03007e,
            0x7f03008c, 0x7f030093, 0x7f03009b, 0x7f03009e,
            0x7f03009f, 0x7f0300bb, 0x7f0300be, 0x7f0300d6,
            0x7f0300df
          };
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#background}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:background
         */
        public static final int ActionBar_background=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#backgroundSplit}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:backgroundSplit
         */
        public static final int ActionBar_backgroundSplit=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#backgroundStacked}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:backgroundStacked
         */
        public static final int ActionBar_backgroundStacked=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetEnd}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetEnd
         */
        public static final int ActionBar_contentInsetEnd=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetEndWithActions}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetEndWithActions
         */
        public static final int ActionBar_contentInsetEndWithActions=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetLeft}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetLeft
         */
        public static final int ActionBar_contentInsetLeft=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetRight}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetRight
         */
        public static final int ActionBar_contentInsetRight=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetStart}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetStart
         */
        public static final int ActionBar_contentInsetStart=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetStartWithNavigation}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetStartWithNavigation
         */
        public static final int ActionBar_contentInsetStartWithNavigation=8;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#customNavigationLayout}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:customNavigationLayout
         */
        public static final int ActionBar_customNavigationLayout=9;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#displayOptions}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>disableHome</td><td>20</td><td></td></tr>
         * <tr><td>homeAsUp</td><td>4</td><td></td></tr>
         * <tr><td>none</td><td>0</td><td></td></tr>
         * <tr><td>showCustom</td><td>10</td><td></td></tr>
         * <tr><td>showHome</td><td>2</td><td></td></tr>
         * <tr><td>showTitle</td><td>8</td><td></td></tr>
         * <tr><td>useLogo</td><td>1</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:displayOptions
         */
        public static final int ActionBar_displayOptions=10;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#divider}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:divider
         */
        public static final int ActionBar_divider=11;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#elevation}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:elevation
         */
        public static final int ActionBar_elevation=12;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#height}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:height
         */
        public static final int ActionBar_height=13;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#hideOnContentScroll}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:hideOnContentScroll
         */
        public static final int ActionBar_hideOnContentScroll=14;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#homeAsUpIndicator}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:homeAsUpIndicator
         */
        public static final int ActionBar_homeAsUpIndicator=15;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#homeLayout}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:homeLayout
         */
        public static final int ActionBar_homeLayout=16;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#icon}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:icon
         */
        public static final int ActionBar_icon=17;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#indeterminateProgressStyle}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:indeterminateProgressStyle
         */
        public static final int ActionBar_indeterminateProgressStyle=18;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#itemPadding}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:itemPadding
         */
        public static final int ActionBar_itemPadding=19;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#logo}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:logo
         */
        public static final int ActionBar_logo=20;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#navigationMode}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>listMode</td><td>1</td><td></td></tr>
         * <tr><td>normal</td><td>0</td><td></td></tr>
         * <tr><td>tabMode</td><td>2</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:navigationMode
         */
        public static final int ActionBar_navigationMode=21;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#popupTheme}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:popupTheme
         */
        public static final int ActionBar_popupTheme=22;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#progressBarPadding}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:progressBarPadding
         */
        public static final int ActionBar_progressBarPadding=23;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#progressBarStyle}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:progressBarStyle
         */
        public static final int ActionBar_progressBarStyle=24;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#subtitle}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:subtitle
         */
        public static final int ActionBar_subtitle=25;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#subtitleTextStyle}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:subtitleTextStyle
         */
        public static final int ActionBar_subtitleTextStyle=26;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#title}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:title
         */
        public static final int ActionBar_title=27;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleTextStyle}
         * attribute's value can be found in the {@link #ActionBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:titleTextStyle
         */
        public static final int ActionBar_titleTextStyle=28;
        /**
         * Attributes that can be used with a ActionBarLayout.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ActionBarLayout_android_layout_gravity android:layout_gravity}</code></td><td></td></tr>
         * </table>
         * @see #ActionBarLayout_android_layout_gravity
         */
        public static final int[] ActionBarLayout={
            0x010100b3
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#layout_gravity}
         * attribute's value can be found in the {@link #ActionBarLayout} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>bottom</td><td>50</td><td></td></tr>
         * <tr><td>center</td><td>11</td><td></td></tr>
         * <tr><td>center_horizontal</td><td>1</td><td></td></tr>
         * <tr><td>center_vertical</td><td>10</td><td></td></tr>
         * <tr><td>clip_horizontal</td><td>8</td><td></td></tr>
         * <tr><td>clip_vertical</td><td>80</td><td></td></tr>
         * <tr><td>end</td><td>800005</td><td></td></tr>
         * <tr><td>fill</td><td>77</td><td></td></tr>
         * <tr><td>fill_horizontal</td><td>7</td><td></td></tr>
         * <tr><td>fill_vertical</td><td>70</td><td></td></tr>
         * <tr><td>left</td><td>3</td><td></td></tr>
         * <tr><td>right</td><td>5</td><td></td></tr>
         * <tr><td>start</td><td>800003</td><td></td></tr>
         * <tr><td>top</td><td>30</td><td></td></tr>
         * </table>
         *
         * @attr name android:layout_gravity
         */
        public static final int ActionBarLayout_android_layout_gravity=0;
        /**
         * Attributes that can be used with a ActionMenuItemView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ActionMenuItemView_android_minWidth android:minWidth}</code></td><td></td></tr>
         * </table>
         * @see #ActionMenuItemView_android_minWidth
         */
        public static final int[] ActionMenuItemView={
            0x0101013f
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#minWidth}
         * attribute's value can be found in the {@link #ActionMenuItemView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:minWidth
         */
        public static final int ActionMenuItemView_android_minWidth=0;
        public static final int[] ActionMenuView={
          };
        /**
         * Attributes that can be used with a ActionMode.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ActionMode_background com.mealplanner.navigationdrawer:background}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionMode_backgroundSplit com.mealplanner.navigationdrawer:backgroundSplit}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionMode_closeItemLayout com.mealplanner.navigationdrawer:closeItemLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionMode_height com.mealplanner.navigationdrawer:height}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionMode_subtitleTextStyle com.mealplanner.navigationdrawer:subtitleTextStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActionMode_titleTextStyle com.mealplanner.navigationdrawer:titleTextStyle}</code></td><td></td></tr>
         * </table>
         * @see #ActionMode_background
         * @see #ActionMode_backgroundSplit
         * @see #ActionMode_closeItemLayout
         * @see #ActionMode_height
         * @see #ActionMode_subtitleTextStyle
         * @see #ActionMode_titleTextStyle
         */
        public static final int[] ActionMode={
            0x7f03002b, 0x7f03002c, 0x7f030046, 0x7f030074,
            0x7f0300be, 0x7f0300df
          };
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#background}
         * attribute's value can be found in the {@link #ActionMode} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:background
         */
        public static final int ActionMode_background=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#backgroundSplit}
         * attribute's value can be found in the {@link #ActionMode} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:backgroundSplit
         */
        public static final int ActionMode_backgroundSplit= ActionBar_backgroundSplit;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#closeItemLayout}
         * attribute's value can be found in the {@link #ActionMode} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:closeItemLayout
         */
        public static final int ActionMode_closeItemLayout=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#height}
         * attribute's value can be found in the {@link #ActionMode} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:height
         */
        public static final int ActionMode_height=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#subtitleTextStyle}
         * attribute's value can be found in the {@link #ActionMode} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:subtitleTextStyle
         */
        public static final int ActionMode_subtitleTextStyle=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleTextStyle}
         * attribute's value can be found in the {@link #ActionMode} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:titleTextStyle
         */
        public static final int ActionMode_titleTextStyle=5;
        /**
         * Attributes that can be used with a ActivityChooserView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ActivityChooserView_expandActivityOverflowButtonDrawable com.mealplanner.navigationdrawer:expandActivityOverflowButtonDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #ActivityChooserView_initialActivityCount com.mealplanner.navigationdrawer:initialActivityCount}</code></td><td></td></tr>
         * </table>
         * @see #ActivityChooserView_expandActivityOverflowButtonDrawable
         * @see #ActivityChooserView_initialActivityCount
         */
        public static final int[] ActivityChooserView={
            0x7f030071, 0x7f03007c
          };
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#expandActivityOverflowButtonDrawable}
         * attribute's value can be found in the {@link #ActivityChooserView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:expandActivityOverflowButtonDrawable
         */
        public static final int ActivityChooserView_expandActivityOverflowButtonDrawable=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#initialActivityCount}
         * attribute's value can be found in the {@link #ActivityChooserView} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:initialActivityCount
         */
        public static final int ActivityChooserView_initialActivityCount=1;
        /**
         * Attributes that can be used with a AlertDialog.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #AlertDialog_android_layout android:layout}</code></td><td></td></tr>
         * <tr><td><code>{@link #AlertDialog_buttonPanelSideLayout com.mealplanner.navigationdrawer:buttonPanelSideLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #AlertDialog_listItemLayout com.mealplanner.navigationdrawer:listItemLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #AlertDialog_listLayout com.mealplanner.navigationdrawer:listLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #AlertDialog_multiChoiceItemLayout com.mealplanner.navigationdrawer:multiChoiceItemLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #AlertDialog_singleChoiceItemLayout com.mealplanner.navigationdrawer:singleChoiceItemLayout}</code></td><td></td></tr>
         * </table>
         * @see #AlertDialog_android_layout
         * @see #AlertDialog_buttonPanelSideLayout
         * @see #AlertDialog_listItemLayout
         * @see #AlertDialog_listLayout
         * @see #AlertDialog_multiChoiceItemLayout
         * @see #AlertDialog_singleChoiceItemLayout
         */
        public static final int[] AlertDialog={
            0x010100f2, 0x7f030038, 0x7f030083, 0x7f030084,
            0x7f030090, 0x7f0300b0
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#layout}
         * attribute's value can be found in the {@link #AlertDialog} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:layout
         */
        public static final int AlertDialog_android_layout=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonPanelSideLayout}
         * attribute's value can be found in the {@link #AlertDialog} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonPanelSideLayout
         */
        public static final int AlertDialog_buttonPanelSideLayout=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listItemLayout}
         * attribute's value can be found in the {@link #AlertDialog} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:listItemLayout
         */
        public static final int AlertDialog_listItemLayout=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listLayout}
         * attribute's value can be found in the {@link #AlertDialog} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:listLayout
         */
        public static final int AlertDialog_listLayout=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#multiChoiceItemLayout}
         * attribute's value can be found in the {@link #AlertDialog} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:multiChoiceItemLayout
         */
        public static final int AlertDialog_multiChoiceItemLayout=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#singleChoiceItemLayout}
         * attribute's value can be found in the {@link #AlertDialog} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:singleChoiceItemLayout
         */
        public static final int AlertDialog_singleChoiceItemLayout=5;
        /**
         * Attributes that can be used with a AppCompatImageView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #AppCompatImageView_android_src android:src}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatImageView_srcCompat com.mealplanner.navigationdrawer:srcCompat}</code></td><td></td></tr>
         * </table>
         * @see #AppCompatImageView_android_src
         * @see #AppCompatImageView_srcCompat
         */
        public static final int[] AppCompatImageView={
            0x01010119, 0x7f0300b6
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#src}
         * attribute's value can be found in the {@link #AppCompatImageView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:src
         */
        public static final int AppCompatImageView_android_src=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#srcCompat}
         * attribute's value can be found in the {@link #AppCompatImageView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:srcCompat
         */
        public static final int AppCompatImageView_srcCompat=1;
        /**
         * Attributes that can be used with a AppCompatSeekBar.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #AppCompatSeekBar_android_thumb android:thumb}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatSeekBar_tickMark com.mealplanner.navigationdrawer:tickMark}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatSeekBar_tickMarkTint com.mealplanner.navigationdrawer:tickMarkTint}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatSeekBar_tickMarkTintMode com.mealplanner.navigationdrawer:tickMarkTintMode}</code></td><td></td></tr>
         * </table>
         * @see #AppCompatSeekBar_android_thumb
         * @see #AppCompatSeekBar_tickMark
         * @see #AppCompatSeekBar_tickMarkTint
         * @see #AppCompatSeekBar_tickMarkTintMode
         */
        public static final int[] AppCompatSeekBar={
            0x01010142, 0x7f0300d3, 0x7f0300d4, 0x7f0300d5
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#thumb}
         * attribute's value can be found in the {@link #AppCompatSeekBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:thumb
         */
        public static final int AppCompatSeekBar_android_thumb=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#tickMark}
         * attribute's value can be found in the {@link #AppCompatSeekBar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:tickMark
         */
        public static final int AppCompatSeekBar_tickMark=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#tickMarkTint}
         * attribute's value can be found in the {@link #AppCompatSeekBar} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:tickMarkTint
         */
        public static final int AppCompatSeekBar_tickMarkTint=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#tickMarkTintMode}
         * attribute's value can be found in the {@link #AppCompatSeekBar} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>add</td><td>10</td><td></td></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:tickMarkTintMode
         */
        public static final int AppCompatSeekBar_tickMarkTintMode=3;
        /**
         * Attributes that can be used with a AppCompatTextView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #AppCompatTextView_android_textAppearance android:textAppearance}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTextView_textAllCaps com.mealplanner.navigationdrawer:textAllCaps}</code></td><td></td></tr>
         * </table>
         * @see #AppCompatTextView_android_textAppearance
         * @see #AppCompatTextView_textAllCaps
         */
        public static final int[] AppCompatTextView={
            0x01010034, 0x7f0300c4
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#textAppearance}
         * attribute's value can be found in the {@link #AppCompatTextView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:textAppearance
         */
        public static final int AppCompatTextView_android_textAppearance=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAllCaps}
         * attribute's value can be found in the {@link #AppCompatTextView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAllCaps
         */
        public static final int AppCompatTextView_textAllCaps=1;
        /**
         * Attributes that can be used with a AppCompatTheme.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #AppCompatTheme_android_windowIsFloating android:windowIsFloating}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_android_windowAnimationStyle android:windowAnimationStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarDivider com.mealplanner.navigationdrawer:actionBarDivider}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarItemBackground com.mealplanner.navigationdrawer:actionBarItemBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarPopupTheme com.mealplanner.navigationdrawer:actionBarPopupTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarSize com.mealplanner.navigationdrawer:actionBarSize}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarSplitStyle com.mealplanner.navigationdrawer:actionBarSplitStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarStyle com.mealplanner.navigationdrawer:actionBarStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarTabBarStyle com.mealplanner.navigationdrawer:actionBarTabBarStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarTabStyle com.mealplanner.navigationdrawer:actionBarTabStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarTabTextStyle com.mealplanner.navigationdrawer:actionBarTabTextStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarTheme com.mealplanner.navigationdrawer:actionBarTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionBarWidgetTheme com.mealplanner.navigationdrawer:actionBarWidgetTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionButtonStyle com.mealplanner.navigationdrawer:actionButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionDropDownStyle com.mealplanner.navigationdrawer:actionDropDownStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionMenuTextAppearance com.mealplanner.navigationdrawer:actionMenuTextAppearance}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionMenuTextColor com.mealplanner.navigationdrawer:actionMenuTextColor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeBackground com.mealplanner.navigationdrawer:actionModeBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeCloseButtonStyle com.mealplanner.navigationdrawer:actionModeCloseButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeCloseDrawable com.mealplanner.navigationdrawer:actionModeCloseDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeCopyDrawable com.mealplanner.navigationdrawer:actionModeCopyDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeCutDrawable com.mealplanner.navigationdrawer:actionModeCutDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeFindDrawable com.mealplanner.navigationdrawer:actionModeFindDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModePasteDrawable com.mealplanner.navigationdrawer:actionModePasteDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModePopupWindowStyle com.mealplanner.navigationdrawer:actionModePopupWindowStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeSelectAllDrawable com.mealplanner.navigationdrawer:actionModeSelectAllDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeShareDrawable com.mealplanner.navigationdrawer:actionModeShareDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeSplitBackground com.mealplanner.navigationdrawer:actionModeSplitBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeStyle com.mealplanner.navigationdrawer:actionModeStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionModeWebSearchDrawable com.mealplanner.navigationdrawer:actionModeWebSearchDrawable}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionOverflowButtonStyle com.mealplanner.navigationdrawer:actionOverflowButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_actionOverflowMenuStyle com.mealplanner.navigationdrawer:actionOverflowMenuStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_activityChooserViewStyle com.mealplanner.navigationdrawer:activityChooserViewStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_alertDialogButtonGroupStyle com.mealplanner.navigationdrawer:alertDialogButtonGroupStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_alertDialogCenterButtons com.mealplanner.navigationdrawer:alertDialogCenterButtons}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_alertDialogStyle com.mealplanner.navigationdrawer:alertDialogStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_alertDialogTheme com.mealplanner.navigationdrawer:alertDialogTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_autoCompleteTextViewStyle com.mealplanner.navigationdrawer:autoCompleteTextViewStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_borderlessButtonStyle com.mealplanner.navigationdrawer:borderlessButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_buttonBarButtonStyle com.mealplanner.navigationdrawer:buttonBarButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_buttonBarNegativeButtonStyle com.mealplanner.navigationdrawer:buttonBarNegativeButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_buttonBarNeutralButtonStyle com.mealplanner.navigationdrawer:buttonBarNeutralButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_buttonBarPositiveButtonStyle com.mealplanner.navigationdrawer:buttonBarPositiveButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_buttonBarStyle com.mealplanner.navigationdrawer:buttonBarStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_buttonStyle com.mealplanner.navigationdrawer:buttonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_buttonStyleSmall com.mealplanner.navigationdrawer:buttonStyleSmall}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_checkboxStyle com.mealplanner.navigationdrawer:checkboxStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_checkedTextViewStyle com.mealplanner.navigationdrawer:checkedTextViewStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorAccent com.mealplanner.navigationdrawer:colorAccent}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorBackgroundFloating com.mealplanner.navigationdrawer:colorBackgroundFloating}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorButtonNormal com.mealplanner.navigationdrawer:colorButtonNormal}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorControlActivated com.mealplanner.navigationdrawer:colorControlActivated}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorControlHighlight com.mealplanner.navigationdrawer:colorControlHighlight}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorControlNormal com.mealplanner.navigationdrawer:colorControlNormal}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorPrimary com.mealplanner.navigationdrawer:colorPrimary}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorPrimaryDark com.mealplanner.navigationdrawer:colorPrimaryDark}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_colorSwitchThumbNormal com.mealplanner.navigationdrawer:colorSwitchThumbNormal}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_controlBackground com.mealplanner.navigationdrawer:controlBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_dialogPreferredPadding com.mealplanner.navigationdrawer:dialogPreferredPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_dialogTheme com.mealplanner.navigationdrawer:dialogTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_dividerHorizontal com.mealplanner.navigationdrawer:dividerHorizontal}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_dividerVertical com.mealplanner.navigationdrawer:dividerVertical}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_dropDownListViewStyle com.mealplanner.navigationdrawer:dropDownListViewStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_dropdownListPreferredItemHeight com.mealplanner.navigationdrawer:dropdownListPreferredItemHeight}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_editTextBackground com.mealplanner.navigationdrawer:editTextBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_editTextColor com.mealplanner.navigationdrawer:editTextColor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_editTextStyle com.mealplanner.navigationdrawer:editTextStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_homeAsUpIndicator com.mealplanner.navigationdrawer:homeAsUpIndicator}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_imageButtonStyle com.mealplanner.navigationdrawer:imageButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listChoiceBackgroundIndicator com.mealplanner.navigationdrawer:listChoiceBackgroundIndicator}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listDividerAlertDialog com.mealplanner.navigationdrawer:listDividerAlertDialog}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listMenuViewStyle com.mealplanner.navigationdrawer:listMenuViewStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listPopupWindowStyle com.mealplanner.navigationdrawer:listPopupWindowStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listPreferredItemHeight com.mealplanner.navigationdrawer:listPreferredItemHeight}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listPreferredItemHeightLarge com.mealplanner.navigationdrawer:listPreferredItemHeightLarge}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listPreferredItemHeightSmall com.mealplanner.navigationdrawer:listPreferredItemHeightSmall}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listPreferredItemPaddingLeft com.mealplanner.navigationdrawer:listPreferredItemPaddingLeft}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_listPreferredItemPaddingRight com.mealplanner.navigationdrawer:listPreferredItemPaddingRight}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_panelBackground com.mealplanner.navigationdrawer:panelBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_panelMenuListTheme com.mealplanner.navigationdrawer:panelMenuListTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_panelMenuListWidth com.mealplanner.navigationdrawer:panelMenuListWidth}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_popupMenuStyle com.mealplanner.navigationdrawer:popupMenuStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_popupWindowStyle com.mealplanner.navigationdrawer:popupWindowStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_radioButtonStyle com.mealplanner.navigationdrawer:radioButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_ratingBarStyle com.mealplanner.navigationdrawer:ratingBarStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_ratingBarStyleIndicator com.mealplanner.navigationdrawer:ratingBarStyleIndicator}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_ratingBarStyleSmall com.mealplanner.navigationdrawer:ratingBarStyleSmall}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_searchViewStyle com.mealplanner.navigationdrawer:searchViewStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_seekBarStyle com.mealplanner.navigationdrawer:seekBarStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_selectableItemBackground com.mealplanner.navigationdrawer:selectableItemBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_selectableItemBackgroundBorderless com.mealplanner.navigationdrawer:selectableItemBackgroundBorderless}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_spinnerDropDownItemStyle com.mealplanner.navigationdrawer:spinnerDropDownItemStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_spinnerStyle com.mealplanner.navigationdrawer:spinnerStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_switchStyle com.mealplanner.navigationdrawer:switchStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textAppearanceLargePopupMenu com.mealplanner.navigationdrawer:textAppearanceLargePopupMenu}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textAppearanceListItem com.mealplanner.navigationdrawer:textAppearanceListItem}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textAppearanceListItemSmall com.mealplanner.navigationdrawer:textAppearanceListItemSmall}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textAppearancePopupMenuHeader com.mealplanner.navigationdrawer:textAppearancePopupMenuHeader}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textAppearanceSearchResultSubtitle com.mealplanner.navigationdrawer:textAppearanceSearchResultSubtitle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textAppearanceSearchResultTitle com.mealplanner.navigationdrawer:textAppearanceSearchResultTitle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textAppearanceSmallPopupMenu com.mealplanner.navigationdrawer:textAppearanceSmallPopupMenu}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textColorAlertDialogListItem com.mealplanner.navigationdrawer:textColorAlertDialogListItem}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_textColorSearchUrl com.mealplanner.navigationdrawer:textColorSearchUrl}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_toolbarNavigationButtonStyle com.mealplanner.navigationdrawer:toolbarNavigationButtonStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_toolbarStyle com.mealplanner.navigationdrawer:toolbarStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowActionBar com.mealplanner.navigationdrawer:windowActionBar}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowActionBarOverlay com.mealplanner.navigationdrawer:windowActionBarOverlay}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowActionModeOverlay com.mealplanner.navigationdrawer:windowActionModeOverlay}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowFixedHeightMajor com.mealplanner.navigationdrawer:windowFixedHeightMajor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowFixedHeightMinor com.mealplanner.navigationdrawer:windowFixedHeightMinor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowFixedWidthMajor com.mealplanner.navigationdrawer:windowFixedWidthMajor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowFixedWidthMinor com.mealplanner.navigationdrawer:windowFixedWidthMinor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowMinWidthMajor com.mealplanner.navigationdrawer:windowMinWidthMajor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowMinWidthMinor com.mealplanner.navigationdrawer:windowMinWidthMinor}</code></td><td></td></tr>
         * <tr><td><code>{@link #AppCompatTheme_windowNoTitle com.mealplanner.navigationdrawer:windowNoTitle}</code></td><td></td></tr>
         * </table>
         * @see #AppCompatTheme_android_windowIsFloating
         * @see #AppCompatTheme_android_windowAnimationStyle
         * @see #AppCompatTheme_actionBarDivider
         * @see #AppCompatTheme_actionBarItemBackground
         * @see #AppCompatTheme_actionBarPopupTheme
         * @see #AppCompatTheme_actionBarSize
         * @see #AppCompatTheme_actionBarSplitStyle
         * @see #AppCompatTheme_actionBarStyle
         * @see #AppCompatTheme_actionBarTabBarStyle
         * @see #AppCompatTheme_actionBarTabStyle
         * @see #AppCompatTheme_actionBarTabTextStyle
         * @see #AppCompatTheme_actionBarTheme
         * @see #AppCompatTheme_actionBarWidgetTheme
         * @see #AppCompatTheme_actionButtonStyle
         * @see #AppCompatTheme_actionDropDownStyle
         * @see #AppCompatTheme_actionMenuTextAppearance
         * @see #AppCompatTheme_actionMenuTextColor
         * @see #AppCompatTheme_actionModeBackground
         * @see #AppCompatTheme_actionModeCloseButtonStyle
         * @see #AppCompatTheme_actionModeCloseDrawable
         * @see #AppCompatTheme_actionModeCopyDrawable
         * @see #AppCompatTheme_actionModeCutDrawable
         * @see #AppCompatTheme_actionModeFindDrawable
         * @see #AppCompatTheme_actionModePasteDrawable
         * @see #AppCompatTheme_actionModePopupWindowStyle
         * @see #AppCompatTheme_actionModeSelectAllDrawable
         * @see #AppCompatTheme_actionModeShareDrawable
         * @see #AppCompatTheme_actionModeSplitBackground
         * @see #AppCompatTheme_actionModeStyle
         * @see #AppCompatTheme_actionModeWebSearchDrawable
         * @see #AppCompatTheme_actionOverflowButtonStyle
         * @see #AppCompatTheme_actionOverflowMenuStyle
         * @see #AppCompatTheme_activityChooserViewStyle
         * @see #AppCompatTheme_alertDialogButtonGroupStyle
         * @see #AppCompatTheme_alertDialogCenterButtons
         * @see #AppCompatTheme_alertDialogStyle
         * @see #AppCompatTheme_alertDialogTheme
         * @see #AppCompatTheme_autoCompleteTextViewStyle
         * @see #AppCompatTheme_borderlessButtonStyle
         * @see #AppCompatTheme_buttonBarButtonStyle
         * @see #AppCompatTheme_buttonBarNegativeButtonStyle
         * @see #AppCompatTheme_buttonBarNeutralButtonStyle
         * @see #AppCompatTheme_buttonBarPositiveButtonStyle
         * @see #AppCompatTheme_buttonBarStyle
         * @see #AppCompatTheme_buttonStyle
         * @see #AppCompatTheme_buttonStyleSmall
         * @see #AppCompatTheme_checkboxStyle
         * @see #AppCompatTheme_checkedTextViewStyle
         * @see #AppCompatTheme_colorAccent
         * @see #AppCompatTheme_colorBackgroundFloating
         * @see #AppCompatTheme_colorButtonNormal
         * @see #AppCompatTheme_colorControlActivated
         * @see #AppCompatTheme_colorControlHighlight
         * @see #AppCompatTheme_colorControlNormal
         * @see #AppCompatTheme_colorPrimary
         * @see #AppCompatTheme_colorPrimaryDark
         * @see #AppCompatTheme_colorSwitchThumbNormal
         * @see #AppCompatTheme_controlBackground
         * @see #AppCompatTheme_dialogPreferredPadding
         * @see #AppCompatTheme_dialogTheme
         * @see #AppCompatTheme_dividerHorizontal
         * @see #AppCompatTheme_dividerVertical
         * @see #AppCompatTheme_dropDownListViewStyle
         * @see #AppCompatTheme_dropdownListPreferredItemHeight
         * @see #AppCompatTheme_editTextBackground
         * @see #AppCompatTheme_editTextColor
         * @see #AppCompatTheme_editTextStyle
         * @see #AppCompatTheme_homeAsUpIndicator
         * @see #AppCompatTheme_imageButtonStyle
         * @see #AppCompatTheme_listChoiceBackgroundIndicator
         * @see #AppCompatTheme_listDividerAlertDialog
         * @see #AppCompatTheme_listMenuViewStyle
         * @see #AppCompatTheme_listPopupWindowStyle
         * @see #AppCompatTheme_listPreferredItemHeight
         * @see #AppCompatTheme_listPreferredItemHeightLarge
         * @see #AppCompatTheme_listPreferredItemHeightSmall
         * @see #AppCompatTheme_listPreferredItemPaddingLeft
         * @see #AppCompatTheme_listPreferredItemPaddingRight
         * @see #AppCompatTheme_panelBackground
         * @see #AppCompatTheme_panelMenuListTheme
         * @see #AppCompatTheme_panelMenuListWidth
         * @see #AppCompatTheme_popupMenuStyle
         * @see #AppCompatTheme_popupWindowStyle
         * @see #AppCompatTheme_radioButtonStyle
         * @see #AppCompatTheme_ratingBarStyle
         * @see #AppCompatTheme_ratingBarStyleIndicator
         * @see #AppCompatTheme_ratingBarStyleSmall
         * @see #AppCompatTheme_searchViewStyle
         * @see #AppCompatTheme_seekBarStyle
         * @see #AppCompatTheme_selectableItemBackground
         * @see #AppCompatTheme_selectableItemBackgroundBorderless
         * @see #AppCompatTheme_spinnerDropDownItemStyle
         * @see #AppCompatTheme_spinnerStyle
         * @see #AppCompatTheme_switchStyle
         * @see #AppCompatTheme_textAppearanceLargePopupMenu
         * @see #AppCompatTheme_textAppearanceListItem
         * @see #AppCompatTheme_textAppearanceListItemSmall
         * @see #AppCompatTheme_textAppearancePopupMenuHeader
         * @see #AppCompatTheme_textAppearanceSearchResultSubtitle
         * @see #AppCompatTheme_textAppearanceSearchResultTitle
         * @see #AppCompatTheme_textAppearanceSmallPopupMenu
         * @see #AppCompatTheme_textColorAlertDialogListItem
         * @see #AppCompatTheme_textColorSearchUrl
         * @see #AppCompatTheme_toolbarNavigationButtonStyle
         * @see #AppCompatTheme_toolbarStyle
         * @see #AppCompatTheme_windowActionBar
         * @see #AppCompatTheme_windowActionBarOverlay
         * @see #AppCompatTheme_windowActionModeOverlay
         * @see #AppCompatTheme_windowFixedHeightMajor
         * @see #AppCompatTheme_windowFixedHeightMinor
         * @see #AppCompatTheme_windowFixedWidthMajor
         * @see #AppCompatTheme_windowFixedWidthMinor
         * @see #AppCompatTheme_windowMinWidthMajor
         * @see #AppCompatTheme_windowMinWidthMinor
         * @see #AppCompatTheme_windowNoTitle
         */
        public static final int[] AppCompatTheme={
            0x01010057, 0x010100ae, 0x7f030000, 0x7f030001,
            0x7f030002, 0x7f030003, 0x7f030004, 0x7f030005,
            0x7f030006, 0x7f030007, 0x7f030008, 0x7f030009,
            0x7f03000a, 0x7f03000b, 0x7f03000c, 0x7f03000e,
            0x7f03000f, 0x7f030010, 0x7f030011, 0x7f030012,
            0x7f030013, 0x7f030014, 0x7f030015, 0x7f030016,
            0x7f030017, 0x7f030018, 0x7f030019, 0x7f03001a,
            0x7f03001b, 0x7f03001c, 0x7f03001d, 0x7f03001e,
            0x7f030021, 0x7f030022, 0x7f030023, 0x7f030024,
            0x7f030025, 0x7f03002a, 0x7f030031, 0x7f030032,
            0x7f030033, 0x7f030034, 0x7f030035, 0x7f030036,
            0x7f030039, 0x7f03003a, 0x7f030043, 0x7f030044,
            0x7f03004a, 0x7f03004b, 0x7f03004c, 0x7f03004d,
            0x7f03004e, 0x7f03004f, 0x7f030050, 0x7f030051,
            0x7f030052, 0x7f03005f, 0x7f030062, 0x7f030063,
            0x7f030066, 0x7f030068, 0x7f03006b, 0x7f03006c,
            0x7f03006d, 0x7f03006e, 0x7f03006f, 0x7f030076,
            0x7f03007a, 0x7f030081, 0x7f030082, 0x7f030085,
            0x7f030086, 0x7f030087, 0x7f030088, 0x7f030089,
            0x7f03008a, 0x7f03008b, 0x7f030097, 0x7f030098,
            0x7f030099, 0x7f03009a, 0x7f03009c, 0x7f0300a2,
            0x7f0300a3, 0x7f0300a4, 0x7f0300a5, 0x7f0300a9,
            0x7f0300aa, 0x7f0300ab, 0x7f0300ac, 0x7f0300b3,
            0x7f0300b4, 0x7f0300c2, 0x7f0300c5, 0x7f0300c6,
            0x7f0300c7, 0x7f0300c8, 0x7f0300c9, 0x7f0300ca,
            0x7f0300cb, 0x7f0300cc, 0x7f0300cd, 0x7f0300e0,
            0x7f0300e1, 0x7f0300e6, 0x7f0300e7, 0x7f0300e8,
            0x7f0300e9, 0x7f0300ea, 0x7f0300eb, 0x7f0300ec,
            0x7f0300ed, 0x7f0300ee, 0x7f0300ef
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#windowIsFloating}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:windowIsFloating
         */
        public static final int AppCompatTheme_android_windowIsFloating=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#windowAnimationStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:windowAnimationStyle
         */
        public static final int AppCompatTheme_android_windowAnimationStyle=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarDivider}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarDivider
         */
        public static final int AppCompatTheme_actionBarDivider=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarItemBackground}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarItemBackground
         */
        public static final int AppCompatTheme_actionBarItemBackground=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarPopupTheme}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarPopupTheme
         */
        public static final int AppCompatTheme_actionBarPopupTheme=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarSize}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>wrap_content</td><td>0</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarSize
         */
        public static final int AppCompatTheme_actionBarSize=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarSplitStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarSplitStyle
         */
        public static final int AppCompatTheme_actionBarSplitStyle=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarStyle
         */
        public static final int AppCompatTheme_actionBarStyle=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarTabBarStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarTabBarStyle
         */
        public static final int AppCompatTheme_actionBarTabBarStyle=8;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarTabStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarTabStyle
         */
        public static final int AppCompatTheme_actionBarTabStyle=9;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarTabTextStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarTabTextStyle
         */
        public static final int AppCompatTheme_actionBarTabTextStyle=10;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarTheme}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarTheme
         */
        public static final int AppCompatTheme_actionBarTheme=11;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionBarWidgetTheme}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionBarWidgetTheme
         */
        public static final int AppCompatTheme_actionBarWidgetTheme=12;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionButtonStyle
         */
        public static final int AppCompatTheme_actionButtonStyle=13;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionDropDownStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionDropDownStyle
         */
        public static final int AppCompatTheme_actionDropDownStyle=14;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionMenuTextAppearance}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionMenuTextAppearance
         */
        public static final int AppCompatTheme_actionMenuTextAppearance=15;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionMenuTextColor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionMenuTextColor
         */
        public static final int AppCompatTheme_actionMenuTextColor=16;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeBackground}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeBackground
         */
        public static final int AppCompatTheme_actionModeBackground=17;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeCloseButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeCloseButtonStyle
         */
        public static final int AppCompatTheme_actionModeCloseButtonStyle=18;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeCloseDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeCloseDrawable
         */
        public static final int AppCompatTheme_actionModeCloseDrawable=19;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeCopyDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeCopyDrawable
         */
        public static final int AppCompatTheme_actionModeCopyDrawable=20;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeCutDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeCutDrawable
         */
        public static final int AppCompatTheme_actionModeCutDrawable=21;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeFindDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeFindDrawable
         */
        public static final int AppCompatTheme_actionModeFindDrawable=22;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModePasteDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModePasteDrawable
         */
        public static final int AppCompatTheme_actionModePasteDrawable=23;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModePopupWindowStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModePopupWindowStyle
         */
        public static final int AppCompatTheme_actionModePopupWindowStyle=24;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeSelectAllDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeSelectAllDrawable
         */
        public static final int AppCompatTheme_actionModeSelectAllDrawable=25;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeShareDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeShareDrawable
         */
        public static final int AppCompatTheme_actionModeShareDrawable=26;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeSplitBackground}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeSplitBackground
         */
        public static final int AppCompatTheme_actionModeSplitBackground=27;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeStyle
         */
        public static final int AppCompatTheme_actionModeStyle=28;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionModeWebSearchDrawable}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionModeWebSearchDrawable
         */
        public static final int AppCompatTheme_actionModeWebSearchDrawable=29;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionOverflowButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionOverflowButtonStyle
         */
        public static final int AppCompatTheme_actionOverflowButtonStyle=30;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionOverflowMenuStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionOverflowMenuStyle
         */
        public static final int AppCompatTheme_actionOverflowMenuStyle=31;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#activityChooserViewStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:activityChooserViewStyle
         */
        public static final int AppCompatTheme_activityChooserViewStyle=32;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#alertDialogButtonGroupStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:alertDialogButtonGroupStyle
         */
        public static final int AppCompatTheme_alertDialogButtonGroupStyle=33;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#alertDialogCenterButtons}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:alertDialogCenterButtons
         */
        public static final int AppCompatTheme_alertDialogCenterButtons=34;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#alertDialogStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:alertDialogStyle
         */
        public static final int AppCompatTheme_alertDialogStyle=35;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#alertDialogTheme}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:alertDialogTheme
         */
        public static final int AppCompatTheme_alertDialogTheme=36;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#autoCompleteTextViewStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:autoCompleteTextViewStyle
         */
        public static final int AppCompatTheme_autoCompleteTextViewStyle=37;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#borderlessButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:borderlessButtonStyle
         */
        public static final int AppCompatTheme_borderlessButtonStyle=38;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonBarButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonBarButtonStyle
         */
        public static final int AppCompatTheme_buttonBarButtonStyle=39;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonBarNegativeButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonBarNegativeButtonStyle
         */
        public static final int AppCompatTheme_buttonBarNegativeButtonStyle=40;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonBarNeutralButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonBarNeutralButtonStyle
         */
        public static final int AppCompatTheme_buttonBarNeutralButtonStyle=41;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonBarPositiveButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonBarPositiveButtonStyle
         */
        public static final int AppCompatTheme_buttonBarPositiveButtonStyle=42;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonBarStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonBarStyle
         */
        public static final int AppCompatTheme_buttonBarStyle=43;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonStyle
         */
        public static final int AppCompatTheme_buttonStyle=44;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonStyleSmall}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonStyleSmall
         */
        public static final int AppCompatTheme_buttonStyleSmall=45;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#checkboxStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:checkboxStyle
         */
        public static final int AppCompatTheme_checkboxStyle=46;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#checkedTextViewStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:checkedTextViewStyle
         */
        public static final int AppCompatTheme_checkedTextViewStyle=47;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorAccent}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorAccent
         */
        public static final int AppCompatTheme_colorAccent=48;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorBackgroundFloating}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorBackgroundFloating
         */
        public static final int AppCompatTheme_colorBackgroundFloating=49;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorButtonNormal}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorButtonNormal
         */
        public static final int AppCompatTheme_colorButtonNormal=50;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorControlActivated}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorControlActivated
         */
        public static final int AppCompatTheme_colorControlActivated=51;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorControlHighlight}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorControlHighlight
         */
        public static final int AppCompatTheme_colorControlHighlight=52;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorControlNormal}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorControlNormal
         */
        public static final int AppCompatTheme_colorControlNormal=53;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorPrimary}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorPrimary
         */
        public static final int AppCompatTheme_colorPrimary=54;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorPrimaryDark}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorPrimaryDark
         */
        public static final int AppCompatTheme_colorPrimaryDark=55;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#colorSwitchThumbNormal}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:colorSwitchThumbNormal
         */
        public static final int AppCompatTheme_colorSwitchThumbNormal=56;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#controlBackground}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:controlBackground
         */
        public static final int AppCompatTheme_controlBackground=57;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#dialogPreferredPadding}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:dialogPreferredPadding
         */
        public static final int AppCompatTheme_dialogPreferredPadding=58;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#dialogTheme}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:dialogTheme
         */
        public static final int AppCompatTheme_dialogTheme=59;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#dividerHorizontal}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:dividerHorizontal
         */
        public static final int AppCompatTheme_dividerHorizontal=60;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#dividerVertical}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:dividerVertical
         */
        public static final int AppCompatTheme_dividerVertical=61;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#dropDownListViewStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:dropDownListViewStyle
         */
        public static final int AppCompatTheme_dropDownListViewStyle=62;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#dropdownListPreferredItemHeight}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:dropdownListPreferredItemHeight
         */
        public static final int AppCompatTheme_dropdownListPreferredItemHeight=63;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#editTextBackground}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:editTextBackground
         */
        public static final int AppCompatTheme_editTextBackground=64;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#editTextColor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:editTextColor
         */
        public static final int AppCompatTheme_editTextColor=65;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#editTextStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:editTextStyle
         */
        public static final int AppCompatTheme_editTextStyle=66;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#homeAsUpIndicator}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:homeAsUpIndicator
         */
        public static final int AppCompatTheme_homeAsUpIndicator=67;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#imageButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:imageButtonStyle
         */
        public static final int AppCompatTheme_imageButtonStyle=68;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listChoiceBackgroundIndicator}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:listChoiceBackgroundIndicator
         */
        public static final int AppCompatTheme_listChoiceBackgroundIndicator=69;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listDividerAlertDialog}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:listDividerAlertDialog
         */
        public static final int AppCompatTheme_listDividerAlertDialog=70;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listMenuViewStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:listMenuViewStyle
         */
        public static final int AppCompatTheme_listMenuViewStyle=71;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listPopupWindowStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:listPopupWindowStyle
         */
        public static final int AppCompatTheme_listPopupWindowStyle=72;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listPreferredItemHeight}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:listPreferredItemHeight
         */
        public static final int AppCompatTheme_listPreferredItemHeight=73;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listPreferredItemHeightLarge}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:listPreferredItemHeightLarge
         */
        public static final int AppCompatTheme_listPreferredItemHeightLarge=74;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listPreferredItemHeightSmall}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:listPreferredItemHeightSmall
         */
        public static final int AppCompatTheme_listPreferredItemHeightSmall=75;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listPreferredItemPaddingLeft}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:listPreferredItemPaddingLeft
         */
        public static final int AppCompatTheme_listPreferredItemPaddingLeft=76;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#listPreferredItemPaddingRight}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:listPreferredItemPaddingRight
         */
        public static final int AppCompatTheme_listPreferredItemPaddingRight=77;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#panelBackground}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:panelBackground
         */
        public static final int AppCompatTheme_panelBackground=78;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#panelMenuListTheme}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:panelMenuListTheme
         */
        public static final int AppCompatTheme_panelMenuListTheme=79;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#panelMenuListWidth}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:panelMenuListWidth
         */
        public static final int AppCompatTheme_panelMenuListWidth=80;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#popupMenuStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:popupMenuStyle
         */
        public static final int AppCompatTheme_popupMenuStyle=81;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#popupWindowStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:popupWindowStyle
         */
        public static final int AppCompatTheme_popupWindowStyle=82;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#radioButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:radioButtonStyle
         */
        public static final int AppCompatTheme_radioButtonStyle=83;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#ratingBarStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:ratingBarStyle
         */
        public static final int AppCompatTheme_ratingBarStyle=84;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#ratingBarStyleIndicator}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:ratingBarStyleIndicator
         */
        public static final int AppCompatTheme_ratingBarStyleIndicator=85;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#ratingBarStyleSmall}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:ratingBarStyleSmall
         */
        public static final int AppCompatTheme_ratingBarStyleSmall=86;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#searchViewStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:searchViewStyle
         */
        public static final int AppCompatTheme_searchViewStyle=87;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#seekBarStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:seekBarStyle
         */
        public static final int AppCompatTheme_seekBarStyle=88;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#selectableItemBackground}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:selectableItemBackground
         */
        public static final int AppCompatTheme_selectableItemBackground=89;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#selectableItemBackgroundBorderless}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:selectableItemBackgroundBorderless
         */
        public static final int AppCompatTheme_selectableItemBackgroundBorderless=90;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#spinnerDropDownItemStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:spinnerDropDownItemStyle
         */
        public static final int AppCompatTheme_spinnerDropDownItemStyle=91;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#spinnerStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:spinnerStyle
         */
        public static final int AppCompatTheme_spinnerStyle=92;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#switchStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:switchStyle
         */
        public static final int AppCompatTheme_switchStyle=93;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAppearanceLargePopupMenu}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAppearanceLargePopupMenu
         */
        public static final int AppCompatTheme_textAppearanceLargePopupMenu=94;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAppearanceListItem}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAppearanceListItem
         */
        public static final int AppCompatTheme_textAppearanceListItem=95;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAppearanceListItemSmall}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAppearanceListItemSmall
         */
        public static final int AppCompatTheme_textAppearanceListItemSmall=96;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAppearancePopupMenuHeader}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAppearancePopupMenuHeader
         */
        public static final int AppCompatTheme_textAppearancePopupMenuHeader=97;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAppearanceSearchResultSubtitle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAppearanceSearchResultSubtitle
         */
        public static final int AppCompatTheme_textAppearanceSearchResultSubtitle=98;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAppearanceSearchResultTitle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAppearanceSearchResultTitle
         */
        public static final int AppCompatTheme_textAppearanceSearchResultTitle=99;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAppearanceSmallPopupMenu}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAppearanceSmallPopupMenu
         */
        public static final int AppCompatTheme_textAppearanceSmallPopupMenu=100;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textColorAlertDialogListItem}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textColorAlertDialogListItem
         */
        public static final int AppCompatTheme_textColorAlertDialogListItem=101;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textColorSearchUrl}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textColorSearchUrl
         */
        public static final int AppCompatTheme_textColorSearchUrl=102;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#toolbarNavigationButtonStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:toolbarNavigationButtonStyle
         */
        public static final int AppCompatTheme_toolbarNavigationButtonStyle=103;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#toolbarStyle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:toolbarStyle
         */
        public static final int AppCompatTheme_toolbarStyle=104;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowActionBar}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:windowActionBar
         */
        public static final int AppCompatTheme_windowActionBar=105;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowActionBarOverlay}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:windowActionBarOverlay
         */
        public static final int AppCompatTheme_windowActionBarOverlay=106;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowActionModeOverlay}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:windowActionModeOverlay
         */
        public static final int AppCompatTheme_windowActionModeOverlay=107;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowFixedHeightMajor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         *
         * @attr name com.mealplanner.navigationdrawer:windowFixedHeightMajor
         */
        public static final int AppCompatTheme_windowFixedHeightMajor=108;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowFixedHeightMinor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         *
         * @attr name com.mealplanner.navigationdrawer:windowFixedHeightMinor
         */
        public static final int AppCompatTheme_windowFixedHeightMinor=109;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowFixedWidthMajor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         *
         * @attr name com.mealplanner.navigationdrawer:windowFixedWidthMajor
         */
        public static final int AppCompatTheme_windowFixedWidthMajor=110;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowFixedWidthMinor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         *
         * @attr name com.mealplanner.navigationdrawer:windowFixedWidthMinor
         */
        public static final int AppCompatTheme_windowFixedWidthMinor=111;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowMinWidthMajor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         *
         * @attr name com.mealplanner.navigationdrawer:windowMinWidthMajor
         */
        public static final int AppCompatTheme_windowMinWidthMajor=112;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowMinWidthMinor}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>May be a fractional value, which is a floating point number appended with
         * either % or %p, such as "<code>14.5%</code>".
         * The % suffix always means a percentage of the base size;
         * the optional %p suffix provides a size relative to some parent container.
         *
         * @attr name com.mealplanner.navigationdrawer:windowMinWidthMinor
         */
        public static final int AppCompatTheme_windowMinWidthMinor=113;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#windowNoTitle}
         * attribute's value can be found in the {@link #AppCompatTheme} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:windowNoTitle
         */
        public static final int AppCompatTheme_windowNoTitle=114;
        /**
         * Attributes that can be used with a ButtonBarLayout.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ButtonBarLayout_allowStacking com.mealplanner.navigationdrawer:allowStacking}</code></td><td></td></tr>
         * </table>
         * @see #ButtonBarLayout_allowStacking
         */
        public static final int[] ButtonBarLayout={
            0x7f030026
          };
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#allowStacking}
         * attribute's value can be found in the {@link #ButtonBarLayout} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:allowStacking
         */
        public static final int ButtonBarLayout_allowStacking=0;
        /**
         * Attributes that can be used with a CardView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #CardView_android_minWidth android:minWidth}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_android_minHeight android:minHeight}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_cardBackgroundColor com.mealplanner.navigationdrawer:cardBackgroundColor}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_cardCornerRadius com.mealplanner.navigationdrawer:cardCornerRadius}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_cardElevation com.mealplanner.navigationdrawer:cardElevation}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_cardMaxElevation com.mealplanner.navigationdrawer:cardMaxElevation}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_cardPreventCornerOverlap com.mealplanner.navigationdrawer:cardPreventCornerOverlap}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_cardUseCompatPadding com.mealplanner.navigationdrawer:cardUseCompatPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_contentPadding com.mealplanner.navigationdrawer:contentPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_contentPaddingBottom com.mealplanner.navigationdrawer:contentPaddingBottom}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_contentPaddingLeft com.mealplanner.navigationdrawer:contentPaddingLeft}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_contentPaddingRight com.mealplanner.navigationdrawer:contentPaddingRight}</code></td><td></td></tr>
         * <tr><td><code>{@link #CardView_contentPaddingTop com.mealplanner.navigationdrawer:contentPaddingTop}</code></td><td></td></tr>
         * </table>
         * @see #CardView_android_minWidth
         * @see #CardView_android_minHeight
         * @see #CardView_cardBackgroundColor
         * @see #CardView_cardCornerRadius
         * @see #CardView_cardElevation
         * @see #CardView_cardMaxElevation
         * @see #CardView_cardPreventCornerOverlap
         * @see #CardView_cardUseCompatPadding
         * @see #CardView_contentPadding
         * @see #CardView_contentPaddingBottom
         * @see #CardView_contentPaddingLeft
         * @see #CardView_contentPaddingRight
         * @see #CardView_contentPaddingTop
         */
        public static final int[] CardView={
            0x0101013f, 0x01010140, 0x7f03003d, 0x7f03003e,
            0x7f03003f, 0x7f030040, 0x7f030041, 0x7f030042,
            0x7f03005a, 0x7f03005b, 0x7f03005c, 0x7f03005d,
            0x7f03005e
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#minWidth}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:minWidth
         */
        public static final int CardView_android_minWidth=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#minHeight}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:minHeight
         */
        public static final int CardView_android_minHeight=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#cardBackgroundColor}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:cardBackgroundColor
         */
        public static final int CardView_cardBackgroundColor=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#cardCornerRadius}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:cardCornerRadius
         */
        public static final int CardView_cardCornerRadius=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#cardElevation}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:cardElevation
         */
        public static final int CardView_cardElevation=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#cardMaxElevation}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:cardMaxElevation
         */
        public static final int CardView_cardMaxElevation=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#cardPreventCornerOverlap}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:cardPreventCornerOverlap
         */
        public static final int CardView_cardPreventCornerOverlap=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#cardUseCompatPadding}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:cardUseCompatPadding
         */
        public static final int CardView_cardUseCompatPadding=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentPadding}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentPadding
         */
        public static final int CardView_contentPadding=8;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentPaddingBottom}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentPaddingBottom
         */
        public static final int CardView_contentPaddingBottom=9;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentPaddingLeft}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentPaddingLeft
         */
        public static final int CardView_contentPaddingLeft=10;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentPaddingRight}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentPaddingRight
         */
        public static final int CardView_contentPaddingRight=11;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentPaddingTop}
         * attribute's value can be found in the {@link #CardView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentPaddingTop
         */
        public static final int CardView_contentPaddingTop=12;
        /**
         * Attributes that can be used with a ColorStateListItem.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ColorStateListItem_android_color android:color}</code></td><td></td></tr>
         * <tr><td><code>{@link #ColorStateListItem_android_alpha android:alpha}</code></td><td></td></tr>
         * <tr><td><code>{@link #ColorStateListItem_alpha com.mealplanner.navigationdrawer:alpha}</code></td><td></td></tr>
         * </table>
         * @see #ColorStateListItem_android_color
         * @see #ColorStateListItem_android_alpha
         * @see #ColorStateListItem_alpha
         */
        public static final int[] ColorStateListItem={
            0x010101a5, 0x0101031f, 0x7f030027
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#color}
         * attribute's value can be found in the {@link #ColorStateListItem} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:color
         */
        public static final int ColorStateListItem_android_color=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#alpha}
         * attribute's value can be found in the {@link #ColorStateListItem} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name android:alpha
         */
        public static final int ColorStateListItem_android_alpha=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#alpha}
         * attribute's value can be found in the {@link #ColorStateListItem} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:alpha
         */
        public static final int ColorStateListItem_alpha=2;
        /**
         * Attributes that can be used with a CompoundButton.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #CompoundButton_android_button android:button}</code></td><td></td></tr>
         * <tr><td><code>{@link #CompoundButton_buttonTint com.mealplanner.navigationdrawer:buttonTint}</code></td><td></td></tr>
         * <tr><td><code>{@link #CompoundButton_buttonTintMode com.mealplanner.navigationdrawer:buttonTintMode}</code></td><td></td></tr>
         * </table>
         * @see #CompoundButton_android_button
         * @see #CompoundButton_buttonTint
         * @see #CompoundButton_buttonTintMode
         */
        public static final int[] CompoundButton={
            0x01010107, 0x7f03003b, 0x7f03003c
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#button}
         * attribute's value can be found in the {@link #CompoundButton} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:button
         */
        public static final int CompoundButton_android_button=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonTint}
         * attribute's value can be found in the {@link #CompoundButton} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:buttonTint
         */
        public static final int CompoundButton_buttonTint=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonTintMode}
         * attribute's value can be found in the {@link #CompoundButton} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:buttonTintMode
         */
        public static final int CompoundButton_buttonTintMode=2;
        /**
         * Attributes that can be used with a DrawerArrowToggle.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_arrowHeadLength com.mealplanner.navigationdrawer:arrowHeadLength}</code></td><td></td></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_arrowShaftLength com.mealplanner.navigationdrawer:arrowShaftLength}</code></td><td></td></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_barLength com.mealplanner.navigationdrawer:barLength}</code></td><td></td></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_color com.mealplanner.navigationdrawer:color}</code></td><td></td></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_drawableSize com.mealplanner.navigationdrawer:drawableSize}</code></td><td></td></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_gapBetweenBars com.mealplanner.navigationdrawer:gapBetweenBars}</code></td><td></td></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_spinBars com.mealplanner.navigationdrawer:spinBars}</code></td><td></td></tr>
         * <tr><td><code>{@link #DrawerArrowToggle_thickness com.mealplanner.navigationdrawer:thickness}</code></td><td></td></tr>
         * </table>
         * @see #DrawerArrowToggle_arrowHeadLength
         * @see #DrawerArrowToggle_arrowShaftLength
         * @see #DrawerArrowToggle_barLength
         * @see #DrawerArrowToggle_color
         * @see #DrawerArrowToggle_drawableSize
         * @see #DrawerArrowToggle_gapBetweenBars
         * @see #DrawerArrowToggle_spinBars
         * @see #DrawerArrowToggle_thickness
         */
        public static final int[] DrawerArrowToggle={
            0x7f030028, 0x7f030029, 0x7f030030, 0x7f030049,
            0x7f030069, 0x7f030072, 0x7f0300b2, 0x7f0300cf
          };
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#arrowHeadLength}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:arrowHeadLength
         */
        public static final int DrawerArrowToggle_arrowHeadLength=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#arrowShaftLength}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:arrowShaftLength
         */
        public static final int DrawerArrowToggle_arrowShaftLength=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#barLength}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:barLength
         */
        public static final int DrawerArrowToggle_barLength=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#color}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:color
         */
        public static final int DrawerArrowToggle_color=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#drawableSize}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:drawableSize
         */
        public static final int DrawerArrowToggle_drawableSize=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#gapBetweenBars}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:gapBetweenBars
         */
        public static final int DrawerArrowToggle_gapBetweenBars=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#spinBars}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:spinBars
         */
        public static final int DrawerArrowToggle_spinBars=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#thickness}
         * attribute's value can be found in the {@link #DrawerArrowToggle} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:thickness
         */
        public static final int DrawerArrowToggle_thickness=7;
        /**
         * Attributes that can be used with a LinearLayoutCompat.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_android_gravity android:gravity}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_android_orientation android:orientation}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_android_baselineAligned android:baselineAligned}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_android_baselineAlignedChildIndex android:baselineAlignedChildIndex}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_android_weightSum android:weightSum}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_divider com.mealplanner.navigationdrawer:divider}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_dividerPadding com.mealplanner.navigationdrawer:dividerPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_measureWithLargestChild com.mealplanner.navigationdrawer:measureWithLargestChild}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_showDividers com.mealplanner.navigationdrawer:showDividers}</code></td><td></td></tr>
         * </table>
         * @see #LinearLayoutCompat_android_gravity
         * @see #LinearLayoutCompat_android_orientation
         * @see #LinearLayoutCompat_android_baselineAligned
         * @see #LinearLayoutCompat_android_baselineAlignedChildIndex
         * @see #LinearLayoutCompat_android_weightSum
         * @see #LinearLayoutCompat_divider
         * @see #LinearLayoutCompat_dividerPadding
         * @see #LinearLayoutCompat_measureWithLargestChild
         * @see #LinearLayoutCompat_showDividers
         */
        public static final int[] LinearLayoutCompat={
            0x010100af, 0x010100c4, 0x01010126, 0x01010127,
            0x01010128, 0x7f030065, 0x7f030067, 0x7f03008f,
            0x7f0300ae
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#gravity}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>bottom</td><td>50</td><td></td></tr>
         * <tr><td>center</td><td>11</td><td></td></tr>
         * <tr><td>center_horizontal</td><td>1</td><td></td></tr>
         * <tr><td>center_vertical</td><td>10</td><td></td></tr>
         * <tr><td>clip_horizontal</td><td>8</td><td></td></tr>
         * <tr><td>clip_vertical</td><td>80</td><td></td></tr>
         * <tr><td>end</td><td>800005</td><td></td></tr>
         * <tr><td>fill</td><td>77</td><td></td></tr>
         * <tr><td>fill_horizontal</td><td>7</td><td></td></tr>
         * <tr><td>fill_vertical</td><td>70</td><td></td></tr>
         * <tr><td>left</td><td>3</td><td></td></tr>
         * <tr><td>right</td><td>5</td><td></td></tr>
         * <tr><td>start</td><td>800003</td><td></td></tr>
         * <tr><td>top</td><td>30</td><td></td></tr>
         * </table>
         *
         * @attr name android:gravity
         */
        public static final int LinearLayoutCompat_android_gravity=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#orientation}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>horizontal</td><td>0</td><td></td></tr>
         * <tr><td>vertical</td><td>1</td><td></td></tr>
         * </table>
         *
         * @attr name android:orientation
         */
        public static final int LinearLayoutCompat_android_orientation=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#baselineAligned}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:baselineAligned
         */
        public static final int LinearLayoutCompat_android_baselineAligned=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#baselineAlignedChildIndex}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>May be an integer value, such as "<code>100</code>".
         *
         * @attr name android:baselineAlignedChildIndex
         */
        public static final int LinearLayoutCompat_android_baselineAlignedChildIndex=3;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#weightSum}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name android:weightSum
         */
        public static final int LinearLayoutCompat_android_weightSum=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#divider}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:divider
         */
        public static final int LinearLayoutCompat_divider=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#dividerPadding}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:dividerPadding
         */
        public static final int LinearLayoutCompat_dividerPadding=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#measureWithLargestChild}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:measureWithLargestChild
         */
        public static final int LinearLayoutCompat_measureWithLargestChild=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#showDividers}
         * attribute's value can be found in the {@link #LinearLayoutCompat} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>beginning</td><td>1</td><td></td></tr>
         * <tr><td>end</td><td>4</td><td></td></tr>
         * <tr><td>middle</td><td>2</td><td></td></tr>
         * <tr><td>none</td><td>0</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:showDividers
         */
        public static final int LinearLayoutCompat_showDividers=8;
        /**
         * Attributes that can be used with a LinearLayoutCompat_Layout.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_gravity android:layout_gravity}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_width android:layout_width}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_height android:layout_height}</code></td><td></td></tr>
         * <tr><td><code>{@link #LinearLayoutCompat_Layout_android_layout_weight android:layout_weight}</code></td><td></td></tr>
         * </table>
         * @see #LinearLayoutCompat_Layout_android_layout_gravity
         * @see #LinearLayoutCompat_Layout_android_layout_width
         * @see #LinearLayoutCompat_Layout_android_layout_height
         * @see #LinearLayoutCompat_Layout_android_layout_weight
         */
        public static final int[] LinearLayoutCompat_Layout={
            0x010100b3, 0x010100f4, 0x010100f5, 0x01010181
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#layout_gravity}
         * attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>bottom</td><td>50</td><td></td></tr>
         * <tr><td>center</td><td>11</td><td></td></tr>
         * <tr><td>center_horizontal</td><td>1</td><td></td></tr>
         * <tr><td>center_vertical</td><td>10</td><td></td></tr>
         * <tr><td>clip_horizontal</td><td>8</td><td></td></tr>
         * <tr><td>clip_vertical</td><td>80</td><td></td></tr>
         * <tr><td>end</td><td>800005</td><td></td></tr>
         * <tr><td>fill</td><td>77</td><td></td></tr>
         * <tr><td>fill_horizontal</td><td>7</td><td></td></tr>
         * <tr><td>fill_vertical</td><td>70</td><td></td></tr>
         * <tr><td>left</td><td>3</td><td></td></tr>
         * <tr><td>right</td><td>5</td><td></td></tr>
         * <tr><td>start</td><td>800003</td><td></td></tr>
         * <tr><td>top</td><td>30</td><td></td></tr>
         * </table>
         *
         * @attr name android:layout_gravity
         */
        public static final int LinearLayoutCompat_Layout_android_layout_gravity=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#layout_width}
         * attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>fill_parent</td><td>ffffffff</td><td></td></tr>
         * <tr><td>match_parent</td><td>ffffffff</td><td></td></tr>
         * <tr><td>wrap_content</td><td>fffffffe</td><td></td></tr>
         * </table>
         *
         * @attr name android:layout_width
         */
        public static final int LinearLayoutCompat_Layout_android_layout_width=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#layout_height}
         * attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>fill_parent</td><td>ffffffff</td><td></td></tr>
         * <tr><td>match_parent</td><td>ffffffff</td><td></td></tr>
         * <tr><td>wrap_content</td><td>fffffffe</td><td></td></tr>
         * </table>
         *
         * @attr name android:layout_height
         */
        public static final int LinearLayoutCompat_Layout_android_layout_height=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#layout_weight}
         * attribute's value can be found in the {@link #LinearLayoutCompat_Layout} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name android:layout_weight
         */
        public static final int LinearLayoutCompat_Layout_android_layout_weight=3;
        /**
         * Attributes that can be used with a ListPopupWindow.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ListPopupWindow_android_dropDownHorizontalOffset android:dropDownHorizontalOffset}</code></td><td></td></tr>
         * <tr><td><code>{@link #ListPopupWindow_android_dropDownVerticalOffset android:dropDownVerticalOffset}</code></td><td></td></tr>
         * </table>
         * @see #ListPopupWindow_android_dropDownHorizontalOffset
         * @see #ListPopupWindow_android_dropDownVerticalOffset
         */
        public static final int[] ListPopupWindow={
            0x010102ac, 0x010102ad
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#dropDownHorizontalOffset}
         * attribute's value can be found in the {@link #ListPopupWindow} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:dropDownHorizontalOffset
         */
        public static final int ListPopupWindow_android_dropDownHorizontalOffset=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#dropDownVerticalOffset}
         * attribute's value can be found in the {@link #ListPopupWindow} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:dropDownVerticalOffset
         */
        public static final int ListPopupWindow_android_dropDownVerticalOffset=1;
        /**
         * Attributes that can be used with a MenuGroup.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #MenuGroup_android_enabled android:enabled}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuGroup_android_id android:id}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuGroup_android_visible android:visible}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuGroup_android_menuCategory android:menuCategory}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuGroup_android_orderInCategory android:orderInCategory}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuGroup_android_checkableBehavior android:checkableBehavior}</code></td><td></td></tr>
         * </table>
         * @see #MenuGroup_android_enabled
         * @see #MenuGroup_android_id
         * @see #MenuGroup_android_visible
         * @see #MenuGroup_android_menuCategory
         * @see #MenuGroup_android_orderInCategory
         * @see #MenuGroup_android_checkableBehavior
         */
        public static final int[] MenuGroup={
            0x0101000e, 0x010100d0, 0x01010194, 0x010101de,
            0x010101df, 0x010101e0
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#enabled}
         * attribute's value can be found in the {@link #MenuGroup} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:enabled
         */
        public static final int MenuGroup_android_enabled=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#id}
         * attribute's value can be found in the {@link #MenuGroup} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:id
         */
        public static final int MenuGroup_android_id=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#visible}
         * attribute's value can be found in the {@link #MenuGroup} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:visible
         */
        public static final int MenuGroup_android_visible=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#menuCategory}
         * attribute's value can be found in the {@link #MenuGroup} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>alternative</td><td>40000</td><td></td></tr>
         * <tr><td>container</td><td>10000</td><td></td></tr>
         * <tr><td>secondary</td><td>30000</td><td></td></tr>
         * <tr><td>system</td><td>20000</td><td></td></tr>
         * </table>
         *
         * @attr name android:menuCategory
         */
        public static final int MenuGroup_android_menuCategory=3;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#orderInCategory}
         * attribute's value can be found in the {@link #MenuGroup} array.
         *
         * <p>May be an integer value, such as "<code>100</code>".
         *
         * @attr name android:orderInCategory
         */
        public static final int MenuGroup_android_orderInCategory=4;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#checkableBehavior}
         * attribute's value can be found in the {@link #MenuGroup} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>all</td><td>1</td><td></td></tr>
         * <tr><td>none</td><td>0</td><td></td></tr>
         * <tr><td>single</td><td>2</td><td></td></tr>
         * </table>
         *
         * @attr name android:checkableBehavior
         */
        public static final int MenuGroup_android_checkableBehavior=5;
        /**
         * Attributes that can be used with a MenuItem.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #MenuItem_android_icon android:icon}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_enabled android:enabled}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_id android:id}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_checked android:checked}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_visible android:visible}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_menuCategory android:menuCategory}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_orderInCategory android:orderInCategory}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_title android:title}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_titleCondensed android:titleCondensed}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_alphabeticShortcut android:alphabeticShortcut}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_numericShortcut android:numericShortcut}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_checkable android:checkable}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_android_onClick android:onClick}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_actionLayout com.mealplanner.navigationdrawer:actionLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_actionProviderClass com.mealplanner.navigationdrawer:actionProviderClass}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_actionViewClass com.mealplanner.navigationdrawer:actionViewClass}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuItem_showAsAction com.mealplanner.navigationdrawer:showAsAction}</code></td><td></td></tr>
         * </table>
         * @see #MenuItem_android_icon
         * @see #MenuItem_android_enabled
         * @see #MenuItem_android_id
         * @see #MenuItem_android_checked
         * @see #MenuItem_android_visible
         * @see #MenuItem_android_menuCategory
         * @see #MenuItem_android_orderInCategory
         * @see #MenuItem_android_title
         * @see #MenuItem_android_titleCondensed
         * @see #MenuItem_android_alphabeticShortcut
         * @see #MenuItem_android_numericShortcut
         * @see #MenuItem_android_checkable
         * @see #MenuItem_android_onClick
         * @see #MenuItem_actionLayout
         * @see #MenuItem_actionProviderClass
         * @see #MenuItem_actionViewClass
         * @see #MenuItem_showAsAction
         */
        public static final int[] MenuItem={
            0x01010002, 0x0101000e, 0x010100d0, 0x01010106,
            0x01010194, 0x010101de, 0x010101df, 0x010101e1,
            0x010101e2, 0x010101e3, 0x010101e4, 0x010101e5,
            0x0101026f, 0x7f03000d, 0x7f03001f, 0x7f030020,
            0x7f0300ad
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#icon}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:icon
         */
        public static final int MenuItem_android_icon=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#enabled}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:enabled
         */
        public static final int MenuItem_android_enabled=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#id}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:id
         */
        public static final int MenuItem_android_id=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#checked}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:checked
         */
        public static final int MenuItem_android_checked=3;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#visible}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:visible
         */
        public static final int MenuItem_android_visible=4;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#menuCategory}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>alternative</td><td>40000</td><td></td></tr>
         * <tr><td>container</td><td>10000</td><td></td></tr>
         * <tr><td>secondary</td><td>30000</td><td></td></tr>
         * <tr><td>system</td><td>20000</td><td></td></tr>
         * </table>
         *
         * @attr name android:menuCategory
         */
        public static final int MenuItem_android_menuCategory=5;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#orderInCategory}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be an integer value, such as "<code>100</code>".
         *
         * @attr name android:orderInCategory
         */
        public static final int MenuItem_android_orderInCategory=6;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#title}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name android:title
         */
        public static final int MenuItem_android_title=7;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#titleCondensed}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name android:titleCondensed
         */
        public static final int MenuItem_android_titleCondensed=8;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#alphabeticShortcut}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name android:alphabeticShortcut
         */
        public static final int MenuItem_android_alphabeticShortcut=9;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#numericShortcut}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name android:numericShortcut
         */
        public static final int MenuItem_android_numericShortcut=10;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#checkable}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name android:checkable
         */
        public static final int MenuItem_android_checkable=11;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#onClick}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name android:onClick
         */
        public static final int MenuItem_android_onClick=12;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionLayout}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:actionLayout
         */
        public static final int MenuItem_actionLayout=13;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionProviderClass}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:actionProviderClass
         */
        public static final int MenuItem_actionProviderClass=14;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#actionViewClass}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:actionViewClass
         */
        public static final int MenuItem_actionViewClass=15;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#showAsAction}
         * attribute's value can be found in the {@link #MenuItem} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>always</td><td>2</td><td></td></tr>
         * <tr><td>collapseActionView</td><td>8</td><td></td></tr>
         * <tr><td>ifRoom</td><td>1</td><td></td></tr>
         * <tr><td>never</td><td>0</td><td></td></tr>
         * <tr><td>withText</td><td>4</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:showAsAction
         */
        public static final int MenuItem_showAsAction=16;
        /**
         * Attributes that can be used with a MenuView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #MenuView_android_windowAnimationStyle android:windowAnimationStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_android_itemTextAppearance android:itemTextAppearance}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_android_horizontalDivider android:horizontalDivider}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_android_verticalDivider android:verticalDivider}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_android_headerBackground android:headerBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_android_itemBackground android:itemBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_android_itemIconDisabledAlpha android:itemIconDisabledAlpha}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_preserveIconSpacing com.mealplanner.navigationdrawer:preserveIconSpacing}</code></td><td></td></tr>
         * <tr><td><code>{@link #MenuView_subMenuArrow com.mealplanner.navigationdrawer:subMenuArrow}</code></td><td></td></tr>
         * </table>
         * @see #MenuView_android_windowAnimationStyle
         * @see #MenuView_android_itemTextAppearance
         * @see #MenuView_android_horizontalDivider
         * @see #MenuView_android_verticalDivider
         * @see #MenuView_android_headerBackground
         * @see #MenuView_android_itemBackground
         * @see #MenuView_android_itemIconDisabledAlpha
         * @see #MenuView_preserveIconSpacing
         * @see #MenuView_subMenuArrow
         */
        public static final int[] MenuView={
            0x010100ae, 0x0101012c, 0x0101012d, 0x0101012e,
            0x0101012f, 0x01010130, 0x01010131, 0x7f03009d,
            0x7f0300b9
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#windowAnimationStyle}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:windowAnimationStyle
         */
        public static final int MenuView_android_windowAnimationStyle=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#itemTextAppearance}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:itemTextAppearance
         */
        public static final int MenuView_android_itemTextAppearance=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#horizontalDivider}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:horizontalDivider
         */
        public static final int MenuView_android_horizontalDivider=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#verticalDivider}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:verticalDivider
         */
        public static final int MenuView_android_verticalDivider=3;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#headerBackground}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:headerBackground
         */
        public static final int MenuView_android_headerBackground=4;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#itemBackground}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:itemBackground
         */
        public static final int MenuView_android_itemBackground=5;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#itemIconDisabledAlpha}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name android:itemIconDisabledAlpha
         */
        public static final int MenuView_android_itemIconDisabledAlpha=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#preserveIconSpacing}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:preserveIconSpacing
         */
        public static final int MenuView_preserveIconSpacing=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#subMenuArrow}
         * attribute's value can be found in the {@link #MenuView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:subMenuArrow
         */
        public static final int MenuView_subMenuArrow=8;
        /**
         * Attributes that can be used with a PopupWindow.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #PopupWindow_android_popupBackground android:popupBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #PopupWindow_android_popupAnimationStyle android:popupAnimationStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #PopupWindow_overlapAnchor com.mealplanner.navigationdrawer:overlapAnchor}</code></td><td></td></tr>
         * </table>
         * @see #PopupWindow_android_popupBackground
         * @see #PopupWindow_android_popupAnimationStyle
         * @see #PopupWindow_overlapAnchor
         */
        public static final int[] PopupWindow={
            0x01010176, 0x010102c9, 0x7f030094
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#popupBackground}
         * attribute's value can be found in the {@link #PopupWindow} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:popupBackground
         */
        public static final int PopupWindow_android_popupBackground=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#popupAnimationStyle}
         * attribute's value can be found in the {@link #PopupWindow} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:popupAnimationStyle
         */
        public static final int PopupWindow_android_popupAnimationStyle=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#overlapAnchor}
         * attribute's value can be found in the {@link #PopupWindow} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:overlapAnchor
         */
        public static final int PopupWindow_overlapAnchor=2;
        /**
         * Attributes that can be used with a PopupWindowBackgroundState.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #PopupWindowBackgroundState_state_above_anchor com.mealplanner.navigationdrawer:state_above_anchor}</code></td><td></td></tr>
         * </table>
         * @see #PopupWindowBackgroundState_state_above_anchor
         */
        public static final int[] PopupWindowBackgroundState={
            0x7f0300b8
          };
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#state_above_anchor}
         * attribute's value can be found in the {@link #PopupWindowBackgroundState} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:state_above_anchor
         */
        public static final int PopupWindowBackgroundState_state_above_anchor=0;
        /**
         * Attributes that can be used with a RecyclerView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #RecyclerView_android_orientation android:orientation}</code></td><td></td></tr>
         * <tr><td><code>{@link #RecyclerView_android_descendantFocusability android:descendantFocusability}</code></td><td></td></tr>
         * <tr><td><code>{@link #RecyclerView_layoutManager com.mealplanner.navigationdrawer:layoutManager}</code></td><td></td></tr>
         * <tr><td><code>{@link #RecyclerView_reverseLayout com.mealplanner.navigationdrawer:reverseLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #RecyclerView_spanCount com.mealplanner.navigationdrawer:spanCount}</code></td><td></td></tr>
         * <tr><td><code>{@link #RecyclerView_stackFromEnd com.mealplanner.navigationdrawer:stackFromEnd}</code></td><td></td></tr>
         * </table>
         * @see #RecyclerView_android_orientation
         * @see #RecyclerView_android_descendantFocusability
         * @see #RecyclerView_layoutManager
         * @see #RecyclerView_reverseLayout
         * @see #RecyclerView_spanCount
         * @see #RecyclerView_stackFromEnd
         */
        public static final int[] RecyclerView={
            0x010100c4, 0x010100f1, 0x7f030080, 0x7f0300a6,
            0x7f0300b1, 0x7f0300b7
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#orientation}
         * attribute's value can be found in the {@link #RecyclerView} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>horizontal</td><td>0</td><td></td></tr>
         * <tr><td>vertical</td><td>1</td><td></td></tr>
         * </table>
         *
         * @attr name android:orientation
         */
        public static final int RecyclerView_android_orientation=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#descendantFocusability}
         * attribute's value can be found in the {@link #RecyclerView} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>afterDescendants</td><td>1</td><td></td></tr>
         * <tr><td>beforeDescendants</td><td>0</td><td></td></tr>
         * <tr><td>blocksDescendants</td><td>2</td><td></td></tr>
         * </table>
         *
         * @attr name android:descendantFocusability
         */
        public static final int RecyclerView_android_descendantFocusability=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#layoutManager}
         * attribute's value can be found in the {@link #RecyclerView} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:layoutManager
         */
        public static final int RecyclerView_layoutManager=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#reverseLayout}
         * attribute's value can be found in the {@link #RecyclerView} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:reverseLayout
         */
        public static final int RecyclerView_reverseLayout=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#spanCount}
         * attribute's value can be found in the {@link #RecyclerView} array.
         *
         * <p>May be an integer value, such as "<code>100</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:spanCount
         */
        public static final int RecyclerView_spanCount=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#stackFromEnd}
         * attribute's value can be found in the {@link #RecyclerView} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:stackFromEnd
         */
        public static final int RecyclerView_stackFromEnd=5;
        /**
         * Attributes that can be used with a SearchView.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #SearchView_android_focusable android:focusable}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_android_maxWidth android:maxWidth}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_android_inputType android:inputType}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_android_imeOptions android:imeOptions}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_closeIcon com.mealplanner.navigationdrawer:closeIcon}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_commitIcon com.mealplanner.navigationdrawer:commitIcon}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_defaultQueryHint com.mealplanner.navigationdrawer:defaultQueryHint}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_goIcon com.mealplanner.navigationdrawer:goIcon}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_iconifiedByDefault com.mealplanner.navigationdrawer:iconifiedByDefault}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_layout com.mealplanner.navigationdrawer:layout}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_queryBackground com.mealplanner.navigationdrawer:queryBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_queryHint com.mealplanner.navigationdrawer:queryHint}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_searchHintIcon com.mealplanner.navigationdrawer:searchHintIcon}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_searchIcon com.mealplanner.navigationdrawer:searchIcon}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_submitBackground com.mealplanner.navigationdrawer:submitBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_suggestionRowLayout com.mealplanner.navigationdrawer:suggestionRowLayout}</code></td><td></td></tr>
         * <tr><td><code>{@link #SearchView_voiceIcon com.mealplanner.navigationdrawer:voiceIcon}</code></td><td></td></tr>
         * </table>
         * @see #SearchView_android_focusable
         * @see #SearchView_android_maxWidth
         * @see #SearchView_android_inputType
         * @see #SearchView_android_imeOptions
         * @see #SearchView_closeIcon
         * @see #SearchView_commitIcon
         * @see #SearchView_defaultQueryHint
         * @see #SearchView_goIcon
         * @see #SearchView_iconifiedByDefault
         * @see #SearchView_layout
         * @see #SearchView_queryBackground
         * @see #SearchView_queryHint
         * @see #SearchView_searchHintIcon
         * @see #SearchView_searchIcon
         * @see #SearchView_submitBackground
         * @see #SearchView_suggestionRowLayout
         * @see #SearchView_voiceIcon
         */
        public static final int[] SearchView={
            0x010100da, 0x0101011f, 0x01010220, 0x01010264,
            0x7f030045, 0x7f030053, 0x7f030061, 0x7f030073,
            0x7f030079, 0x7f03007f, 0x7f0300a0, 0x7f0300a1,
            0x7f0300a7, 0x7f0300a8, 0x7f0300ba, 0x7f0300bf,
            0x7f0300e5
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#focusable}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>auto</td><td>10</td><td></td></tr>
         * </table>
         *
         * @attr name android:focusable
         */
        public static final int SearchView_android_focusable=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#maxWidth}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:maxWidth
         */
        public static final int SearchView_android_maxWidth=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#inputType}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>date</td><td>14</td><td></td></tr>
         * <tr><td>datetime</td><td>4</td><td></td></tr>
         * <tr><td>none</td><td>0</td><td></td></tr>
         * <tr><td>number</td><td>2</td><td></td></tr>
         * <tr><td>numberDecimal</td><td>2002</td><td></td></tr>
         * <tr><td>numberPassword</td><td>12</td><td></td></tr>
         * <tr><td>numberSigned</td><td>1002</td><td></td></tr>
         * <tr><td>phone</td><td>3</td><td></td></tr>
         * <tr><td>text</td><td>1</td><td></td></tr>
         * <tr><td>textAutoComplete</td><td>10001</td><td></td></tr>
         * <tr><td>textAutoCorrect</td><td>8001</td><td></td></tr>
         * <tr><td>textCapCharacters</td><td>1001</td><td></td></tr>
         * <tr><td>textCapSentences</td><td>4001</td><td></td></tr>
         * <tr><td>textCapWords</td><td>2001</td><td></td></tr>
         * <tr><td>textEmailAddress</td><td>21</td><td></td></tr>
         * <tr><td>textEmailSubject</td><td>31</td><td></td></tr>
         * <tr><td>textFilter</td><td>b1</td><td></td></tr>
         * <tr><td>textImeMultiLine</td><td>40001</td><td></td></tr>
         * <tr><td>textLongMessage</td><td>51</td><td></td></tr>
         * <tr><td>textMultiLine</td><td>20001</td><td></td></tr>
         * <tr><td>textNoSuggestions</td><td>80001</td><td></td></tr>
         * <tr><td>textPassword</td><td>81</td><td></td></tr>
         * <tr><td>textPersonName</td><td>61</td><td></td></tr>
         * <tr><td>textPhonetic</td><td>c1</td><td></td></tr>
         * <tr><td>textPostalAddress</td><td>71</td><td></td></tr>
         * <tr><td>textShortMessage</td><td>41</td><td></td></tr>
         * <tr><td>textUri</td><td>11</td><td></td></tr>
         * <tr><td>textVisiblePassword</td><td>91</td><td></td></tr>
         * <tr><td>textWebEditText</td><td>a1</td><td></td></tr>
         * <tr><td>textWebEmailAddress</td><td>d1</td><td></td></tr>
         * <tr><td>textWebPassword</td><td>e1</td><td></td></tr>
         * <tr><td>time</td><td>24</td><td></td></tr>
         * </table>
         *
         * @attr name android:inputType
         */
        public static final int SearchView_android_inputType=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#imeOptions}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>actionDone</td><td>6</td><td></td></tr>
         * <tr><td>actionGo</td><td>2</td><td></td></tr>
         * <tr><td>actionNext</td><td>5</td><td></td></tr>
         * <tr><td>actionNone</td><td>1</td><td></td></tr>
         * <tr><td>actionPrevious</td><td>7</td><td></td></tr>
         * <tr><td>actionSearch</td><td>3</td><td></td></tr>
         * <tr><td>actionSend</td><td>4</td><td></td></tr>
         * <tr><td>actionUnspecified</td><td>0</td><td></td></tr>
         * <tr><td>flagForceAscii</td><td>80000000</td><td></td></tr>
         * <tr><td>flagNavigateNext</td><td>8000000</td><td></td></tr>
         * <tr><td>flagNavigatePrevious</td><td>4000000</td><td></td></tr>
         * <tr><td>flagNoAccessoryAction</td><td>20000000</td><td></td></tr>
         * <tr><td>flagNoEnterAction</td><td>40000000</td><td></td></tr>
         * <tr><td>flagNoExtractUi</td><td>10000000</td><td></td></tr>
         * <tr><td>flagNoFullscreen</td><td>2000000</td><td></td></tr>
         * <tr><td>flagNoPersonalizedLearning</td><td>1000000</td><td></td></tr>
         * <tr><td>normal</td><td>0</td><td></td></tr>
         * </table>
         *
         * @attr name android:imeOptions
         */
        public static final int SearchView_android_imeOptions=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#closeIcon}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:closeIcon
         */
        public static final int SearchView_closeIcon=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#commitIcon}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:commitIcon
         */
        public static final int SearchView_commitIcon=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#defaultQueryHint}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:defaultQueryHint
         */
        public static final int SearchView_defaultQueryHint=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#goIcon}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:goIcon
         */
        public static final int SearchView_goIcon=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#iconifiedByDefault}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:iconifiedByDefault
         */
        public static final int SearchView_iconifiedByDefault=8;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#layout}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:layout
         */
        public static final int SearchView_layout=9;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#queryBackground}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:queryBackground
         */
        public static final int SearchView_queryBackground=10;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#queryHint}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:queryHint
         */
        public static final int SearchView_queryHint=11;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#searchHintIcon}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:searchHintIcon
         */
        public static final int SearchView_searchHintIcon=12;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#searchIcon}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:searchIcon
         */
        public static final int SearchView_searchIcon=13;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#submitBackground}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:submitBackground
         */
        public static final int SearchView_submitBackground=14;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#suggestionRowLayout}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:suggestionRowLayout
         */
        public static final int SearchView_suggestionRowLayout=15;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#voiceIcon}
         * attribute's value can be found in the {@link #SearchView} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:voiceIcon
         */
        public static final int SearchView_voiceIcon=16;
        /**
         * Attributes that can be used with a Spinner.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #Spinner_android_entries android:entries}</code></td><td></td></tr>
         * <tr><td><code>{@link #Spinner_android_popupBackground android:popupBackground}</code></td><td></td></tr>
         * <tr><td><code>{@link #Spinner_android_prompt android:prompt}</code></td><td></td></tr>
         * <tr><td><code>{@link #Spinner_android_dropDownWidth android:dropDownWidth}</code></td><td></td></tr>
         * <tr><td><code>{@link #Spinner_popupTheme com.mealplanner.navigationdrawer:popupTheme}</code></td><td></td></tr>
         * </table>
         * @see #Spinner_android_entries
         * @see #Spinner_android_popupBackground
         * @see #Spinner_android_prompt
         * @see #Spinner_android_dropDownWidth
         * @see #Spinner_popupTheme
         */
        public static final int[] Spinner={
            0x010100b2, 0x01010176, 0x0101017b, 0x01010262,
            0x7f03009b
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#entries}
         * attribute's value can be found in the {@link #Spinner} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:entries
         */
        public static final int Spinner_android_entries=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#popupBackground}
         * attribute's value can be found in the {@link #Spinner} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:popupBackground
         */
        public static final int Spinner_android_popupBackground=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#prompt}
         * attribute's value can be found in the {@link #Spinner} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:prompt
         */
        public static final int Spinner_android_prompt=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#dropDownWidth}
         * attribute's value can be found in the {@link #Spinner} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>fill_parent</td><td>ffffffff</td><td></td></tr>
         * <tr><td>match_parent</td><td>ffffffff</td><td></td></tr>
         * <tr><td>wrap_content</td><td>fffffffe</td><td></td></tr>
         * </table>
         *
         * @attr name android:dropDownWidth
         */
        public static final int Spinner_android_dropDownWidth=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#popupTheme}
         * attribute's value can be found in the {@link #Spinner} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:popupTheme
         */
        public static final int Spinner_popupTheme=4;
        /**
         * Attributes that can be used with a SwitchCompat.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #SwitchCompat_android_textOn android:textOn}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_android_textOff android:textOff}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_android_thumb android:thumb}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_showText com.mealplanner.navigationdrawer:showText}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_splitTrack com.mealplanner.navigationdrawer:splitTrack}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_switchMinWidth com.mealplanner.navigationdrawer:switchMinWidth}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_switchPadding com.mealplanner.navigationdrawer:switchPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_switchTextAppearance com.mealplanner.navigationdrawer:switchTextAppearance}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_thumbTextPadding com.mealplanner.navigationdrawer:thumbTextPadding}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_thumbTint com.mealplanner.navigationdrawer:thumbTint}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_thumbTintMode com.mealplanner.navigationdrawer:thumbTintMode}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_track com.mealplanner.navigationdrawer:track}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_trackTint com.mealplanner.navigationdrawer:trackTint}</code></td><td></td></tr>
         * <tr><td><code>{@link #SwitchCompat_trackTintMode com.mealplanner.navigationdrawer:trackTintMode}</code></td><td></td></tr>
         * </table>
         * @see #SwitchCompat_android_textOn
         * @see #SwitchCompat_android_textOff
         * @see #SwitchCompat_android_thumb
         * @see #SwitchCompat_showText
         * @see #SwitchCompat_splitTrack
         * @see #SwitchCompat_switchMinWidth
         * @see #SwitchCompat_switchPadding
         * @see #SwitchCompat_switchTextAppearance
         * @see #SwitchCompat_thumbTextPadding
         * @see #SwitchCompat_thumbTint
         * @see #SwitchCompat_thumbTintMode
         * @see #SwitchCompat_track
         * @see #SwitchCompat_trackTint
         * @see #SwitchCompat_trackTintMode
         */
        public static final int[] SwitchCompat={
            0x01010124, 0x01010125, 0x01010142, 0x7f0300af,
            0x7f0300b5, 0x7f0300c0, 0x7f0300c1, 0x7f0300c3,
            0x7f0300d0, 0x7f0300d1, 0x7f0300d2, 0x7f0300e2,
            0x7f0300e3, 0x7f0300e4
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#textOn}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name android:textOn
         */
        public static final int SwitchCompat_android_textOn=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#textOff}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name android:textOff
         */
        public static final int SwitchCompat_android_textOff=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#thumb}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:thumb
         */
        public static final int SwitchCompat_android_thumb=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#showText}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:showText
         */
        public static final int SwitchCompat_showText=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#splitTrack}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:splitTrack
         */
        public static final int SwitchCompat_splitTrack=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#switchMinWidth}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:switchMinWidth
         */
        public static final int SwitchCompat_switchMinWidth=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#switchPadding}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:switchPadding
         */
        public static final int SwitchCompat_switchPadding=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#switchTextAppearance}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:switchTextAppearance
         */
        public static final int SwitchCompat_switchTextAppearance=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#thumbTextPadding}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:thumbTextPadding
         */
        public static final int SwitchCompat_thumbTextPadding=8;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#thumbTint}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:thumbTint
         */
        public static final int SwitchCompat_thumbTint=9;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#thumbTintMode}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>add</td><td>10</td><td></td></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:thumbTintMode
         */
        public static final int SwitchCompat_thumbTintMode=10;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#track}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:track
         */
        public static final int SwitchCompat_track=11;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#trackTint}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:trackTint
         */
        public static final int SwitchCompat_trackTint=12;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#trackTintMode}
         * attribute's value can be found in the {@link #SwitchCompat} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>add</td><td>10</td><td></td></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:trackTintMode
         */
        public static final int SwitchCompat_trackTintMode=13;
        /**
         * Attributes that can be used with a TextAppearance.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #TextAppearance_android_textSize android:textSize}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_android_typeface android:typeface}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_android_textStyle android:textStyle}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_android_textColor android:textColor}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_android_shadowColor android:shadowColor}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_android_shadowDx android:shadowDx}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_android_shadowDy android:shadowDy}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_android_shadowRadius android:shadowRadius}</code></td><td></td></tr>
         * <tr><td><code>{@link #TextAppearance_textAllCaps com.mealplanner.navigationdrawer:textAllCaps}</code></td><td></td></tr>
         * </table>
         * @see #TextAppearance_android_textSize
         * @see #TextAppearance_android_typeface
         * @see #TextAppearance_android_textStyle
         * @see #TextAppearance_android_textColor
         * @see #TextAppearance_android_shadowColor
         * @see #TextAppearance_android_shadowDx
         * @see #TextAppearance_android_shadowDy
         * @see #TextAppearance_android_shadowRadius
         * @see #TextAppearance_textAllCaps
         */
        public static final int[] TextAppearance={
            0x01010095, 0x01010096, 0x01010097, 0x01010098,
            0x01010161, 0x01010162, 0x01010163, 0x01010164,
            0x7f0300c4
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#textSize}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:textSize
         */
        public static final int TextAppearance_android_textSize=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#typeface}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>monospace</td><td>3</td><td></td></tr>
         * <tr><td>normal</td><td>0</td><td></td></tr>
         * <tr><td>sans</td><td>1</td><td></td></tr>
         * <tr><td>serif</td><td>2</td><td></td></tr>
         * </table>
         *
         * @attr name android:typeface
         */
        public static final int TextAppearance_android_typeface=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#textStyle}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>bold</td><td>1</td><td></td></tr>
         * <tr><td>italic</td><td>2</td><td></td></tr>
         * <tr><td>normal</td><td>0</td><td></td></tr>
         * </table>
         *
         * @attr name android:textStyle
         */
        public static final int TextAppearance_android_textStyle=2;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#textColor}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:textColor
         */
        public static final int TextAppearance_android_textColor=3;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#shadowColor}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:shadowColor
         */
        public static final int TextAppearance_android_shadowColor=4;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#shadowDx}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name android:shadowDx
         */
        public static final int TextAppearance_android_shadowDx=5;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#shadowDy}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name android:shadowDy
         */
        public static final int TextAppearance_android_shadowDy=6;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#shadowRadius}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>May be a floating point value, such as "<code>1.2</code>".
         *
         * @attr name android:shadowRadius
         */
        public static final int TextAppearance_android_shadowRadius=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#textAllCaps}
         * attribute's value can be found in the {@link #TextAppearance} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         *
         * @attr name com.mealplanner.navigationdrawer:textAllCaps
         */
        public static final int TextAppearance_textAllCaps=8;
        /**
         * Attributes that can be used with a Toolbar.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #Toolbar_android_gravity android:gravity}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_android_minHeight android:minHeight}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_buttonGravity com.mealplanner.navigationdrawer:buttonGravity}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_collapseContentDescription com.mealplanner.navigationdrawer:collapseContentDescription}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_collapseIcon com.mealplanner.navigationdrawer:collapseIcon}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_contentInsetEnd com.mealplanner.navigationdrawer:contentInsetEnd}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_contentInsetEndWithActions com.mealplanner.navigationdrawer:contentInsetEndWithActions}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_contentInsetLeft com.mealplanner.navigationdrawer:contentInsetLeft}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_contentInsetRight com.mealplanner.navigationdrawer:contentInsetRight}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_contentInsetStart com.mealplanner.navigationdrawer:contentInsetStart}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_contentInsetStartWithNavigation com.mealplanner.navigationdrawer:contentInsetStartWithNavigation}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_logo com.mealplanner.navigationdrawer:logo}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_logoDescription com.mealplanner.navigationdrawer:logoDescription}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_maxButtonHeight com.mealplanner.navigationdrawer:maxButtonHeight}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_navigationContentDescription com.mealplanner.navigationdrawer:navigationContentDescription}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_navigationIcon com.mealplanner.navigationdrawer:navigationIcon}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_popupTheme com.mealplanner.navigationdrawer:popupTheme}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_subtitle com.mealplanner.navigationdrawer:subtitle}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_subtitleTextAppearance com.mealplanner.navigationdrawer:subtitleTextAppearance}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_subtitleTextColor com.mealplanner.navigationdrawer:subtitleTextColor}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_title com.mealplanner.navigationdrawer:title}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleMargin com.mealplanner.navigationdrawer:titleMargin}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleMarginBottom com.mealplanner.navigationdrawer:titleMarginBottom}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleMarginEnd com.mealplanner.navigationdrawer:titleMarginEnd}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleMarginStart com.mealplanner.navigationdrawer:titleMarginStart}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleMarginTop com.mealplanner.navigationdrawer:titleMarginTop}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleMargins com.mealplanner.navigationdrawer:titleMargins}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleTextAppearance com.mealplanner.navigationdrawer:titleTextAppearance}</code></td><td></td></tr>
         * <tr><td><code>{@link #Toolbar_titleTextColor com.mealplanner.navigationdrawer:titleTextColor}</code></td><td></td></tr>
         * </table>
         * @see #Toolbar_android_gravity
         * @see #Toolbar_android_minHeight
         * @see #Toolbar_buttonGravity
         * @see #Toolbar_collapseContentDescription
         * @see #Toolbar_collapseIcon
         * @see #Toolbar_contentInsetEnd
         * @see #Toolbar_contentInsetEndWithActions
         * @see #Toolbar_contentInsetLeft
         * @see #Toolbar_contentInsetRight
         * @see #Toolbar_contentInsetStart
         * @see #Toolbar_contentInsetStartWithNavigation
         * @see #Toolbar_logo
         * @see #Toolbar_logoDescription
         * @see #Toolbar_maxButtonHeight
         * @see #Toolbar_navigationContentDescription
         * @see #Toolbar_navigationIcon
         * @see #Toolbar_popupTheme
         * @see #Toolbar_subtitle
         * @see #Toolbar_subtitleTextAppearance
         * @see #Toolbar_subtitleTextColor
         * @see #Toolbar_title
         * @see #Toolbar_titleMargin
         * @see #Toolbar_titleMarginBottom
         * @see #Toolbar_titleMarginEnd
         * @see #Toolbar_titleMarginStart
         * @see #Toolbar_titleMarginTop
         * @see #Toolbar_titleMargins
         * @see #Toolbar_titleTextAppearance
         * @see #Toolbar_titleTextColor
         */
        public static final int[] Toolbar={
            0x010100af, 0x01010140, 0x7f030037, 0x7f030047,
            0x7f030048, 0x7f030054, 0x7f030055, 0x7f030056,
            0x7f030057, 0x7f030058, 0x7f030059, 0x7f03008c,
            0x7f03008d, 0x7f03008e, 0x7f030091, 0x7f030092,
            0x7f03009b, 0x7f0300bb, 0x7f0300bc, 0x7f0300bd,
            0x7f0300d6, 0x7f0300d7, 0x7f0300d8, 0x7f0300d9,
            0x7f0300da, 0x7f0300db, 0x7f0300dc, 0x7f0300dd,
            0x7f0300de
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#gravity}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>bottom</td><td>50</td><td></td></tr>
         * <tr><td>center</td><td>11</td><td></td></tr>
         * <tr><td>center_horizontal</td><td>1</td><td></td></tr>
         * <tr><td>center_vertical</td><td>10</td><td></td></tr>
         * <tr><td>clip_horizontal</td><td>8</td><td></td></tr>
         * <tr><td>clip_vertical</td><td>80</td><td></td></tr>
         * <tr><td>end</td><td>800005</td><td></td></tr>
         * <tr><td>fill</td><td>77</td><td></td></tr>
         * <tr><td>fill_horizontal</td><td>7</td><td></td></tr>
         * <tr><td>fill_vertical</td><td>70</td><td></td></tr>
         * <tr><td>left</td><td>3</td><td></td></tr>
         * <tr><td>right</td><td>5</td><td></td></tr>
         * <tr><td>start</td><td>800003</td><td></td></tr>
         * <tr><td>top</td><td>30</td><td></td></tr>
         * </table>
         *
         * @attr name android:gravity
         */
        public static final int Toolbar_android_gravity=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#minHeight}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name android:minHeight
         */
        public static final int Toolbar_android_minHeight=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#buttonGravity}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>Must be one or more (separated by '|') of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>bottom</td><td>50</td><td></td></tr>
         * <tr><td>top</td><td>30</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:buttonGravity
         */
        public static final int Toolbar_buttonGravity=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#collapseContentDescription}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:collapseContentDescription
         */
        public static final int Toolbar_collapseContentDescription=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#collapseIcon}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:collapseIcon
         */
        public static final int Toolbar_collapseIcon=4;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetEnd}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetEnd
         */
        public static final int Toolbar_contentInsetEnd=5;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetEndWithActions}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetEndWithActions
         */
        public static final int Toolbar_contentInsetEndWithActions=6;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetLeft}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetLeft
         */
        public static final int Toolbar_contentInsetLeft=7;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetRight}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetRight
         */
        public static final int Toolbar_contentInsetRight=8;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetStart}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetStart
         */
        public static final int Toolbar_contentInsetStart=9;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#contentInsetStartWithNavigation}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:contentInsetStartWithNavigation
         */
        public static final int Toolbar_contentInsetStartWithNavigation=10;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#logo}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:logo
         */
        public static final int Toolbar_logo=11;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#logoDescription}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:logoDescription
         */
        public static final int Toolbar_logoDescription=12;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#maxButtonHeight}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:maxButtonHeight
         */
        public static final int Toolbar_maxButtonHeight=13;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#navigationContentDescription}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:navigationContentDescription
         */
        public static final int Toolbar_navigationContentDescription=14;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#navigationIcon}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:navigationIcon
         */
        public static final int Toolbar_navigationIcon=15;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#popupTheme}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:popupTheme
         */
        public static final int Toolbar_popupTheme=16;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#subtitle}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:subtitle
         */
        public static final int Toolbar_subtitle=17;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#subtitleTextAppearance}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:subtitleTextAppearance
         */
        public static final int Toolbar_subtitleTextAppearance=18;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#subtitleTextColor}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:subtitleTextColor
         */
        public static final int Toolbar_subtitleTextColor=19;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#title}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a string value, using '\\;' to escape characters such as
         * '\\n' or '\\uxxxx' for a unicode character;
         *
         * @attr name com.mealplanner.navigationdrawer:title
         */
        public static final int Toolbar_title=20;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleMargin}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:titleMargin
         */
        public static final int Toolbar_titleMargin=21;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleMarginBottom}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:titleMarginBottom
         */
        public static final int Toolbar_titleMarginBottom=22;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleMarginEnd}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:titleMarginEnd
         */
        public static final int Toolbar_titleMarginEnd=23;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleMarginStart}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:titleMarginStart
         */
        public static final int Toolbar_titleMarginStart=24;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleMarginTop}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:titleMarginTop
         */
        public static final int Toolbar_titleMarginTop=25;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleMargins}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:titleMargins
         */
        public static final int Toolbar_titleMargins=26;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleTextAppearance}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:titleTextAppearance
         */
        public static final int Toolbar_titleTextAppearance=27;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#titleTextColor}
         * attribute's value can be found in the {@link #Toolbar} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:titleTextColor
         */
        public static final int Toolbar_titleTextColor=28;
        /**
         * Attributes that can be used with a View.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #View_android_theme android:theme}</code></td><td></td></tr>
         * <tr><td><code>{@link #View_android_focusable android:focusable}</code></td><td></td></tr>
         * <tr><td><code>{@link #View_paddingEnd com.mealplanner.navigationdrawer:paddingEnd}</code></td><td></td></tr>
         * <tr><td><code>{@link #View_paddingStart com.mealplanner.navigationdrawer:paddingStart}</code></td><td></td></tr>
         * <tr><td><code>{@link #View_theme com.mealplanner.navigationdrawer:theme}</code></td><td></td></tr>
         * </table>
         * @see #View_android_theme
         * @see #View_android_focusable
         * @see #View_paddingEnd
         * @see #View_paddingStart
         * @see #View_theme
         */
        public static final int[] View={
            0x01010000, 0x010100da, 0x7f030095, 0x7f030096,
            0x7f0300ce
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#theme}
         * attribute's value can be found in the {@link #View} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:theme
         */
        public static final int View_android_theme=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#focusable}
         * attribute's value can be found in the {@link #View} array.
         *
         * <p>May be a boolean value, such as "<code>true</code>" or
         * "<code>false</code>".
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>auto</td><td>10</td><td></td></tr>
         * </table>
         *
         * @attr name android:focusable
         */
        public static final int View_android_focusable=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#paddingEnd}
         * attribute's value can be found in the {@link #View} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:paddingEnd
         */
        public static final int View_paddingEnd=2;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#paddingStart}
         * attribute's value can be found in the {@link #View} array.
         *
         * <p>May be a dimension value, which is a floating point number appended with a
         * unit such as "<code>14.5sp</code>".
         * Available units are: px (pixels), dp (density-independent pixels),
         * sp (scaled pixels based on preferred font size), in (inches), and
         * mm (millimeters).
         *
         * @attr name com.mealplanner.navigationdrawer:paddingStart
         */
        public static final int View_paddingStart=3;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#theme}
         * attribute's value can be found in the {@link #View} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:theme
         */
        public static final int View_theme=4;
        /**
         * Attributes that can be used with a ViewBackgroundHelper.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ViewBackgroundHelper_android_background android:background}</code></td><td></td></tr>
         * <tr><td><code>{@link #ViewBackgroundHelper_backgroundTint com.mealplanner.navigationdrawer:backgroundTint}</code></td><td></td></tr>
         * <tr><td><code>{@link #ViewBackgroundHelper_backgroundTintMode com.mealplanner.navigationdrawer:backgroundTintMode}</code></td><td></td></tr>
         * </table>
         * @see #ViewBackgroundHelper_android_background
         * @see #ViewBackgroundHelper_backgroundTint
         * @see #ViewBackgroundHelper_backgroundTintMode
         */
        public static final int[] ViewBackgroundHelper={
            0x010100d4, 0x7f03002e, 0x7f03002f
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#background}
         * attribute's value can be found in the {@link #ViewBackgroundHelper} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name android:background
         */
        public static final int ViewBackgroundHelper_android_background=0;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#backgroundTint}
         * attribute's value can be found in the {@link #ViewBackgroundHelper} array.
         *
         * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
         * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
         * "<code>#<i>aarrggbb</i></code>".
         *
         * @attr name com.mealplanner.navigationdrawer:backgroundTint
         */
        public static final int ViewBackgroundHelper_backgroundTint=1;
        /**
         * <p>This symbol is the offset where the {@link com.mealplanner.navigationdrawer.R.attr#backgroundTintMode}
         * attribute's value can be found in the {@link #ViewBackgroundHelper} array.
         *
         * <p>Must be one of the following constant values.</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         * <tr><td>multiply</td><td>e</td><td></td></tr>
         * <tr><td>screen</td><td>f</td><td></td></tr>
         * <tr><td>src_atop</td><td>9</td><td></td></tr>
         * <tr><td>src_in</td><td>5</td><td></td></tr>
         * <tr><td>src_over</td><td>3</td><td></td></tr>
         * </table>
         *
         * @attr name com.mealplanner.navigationdrawer:backgroundTintMode
         */
        public static final int ViewBackgroundHelper_backgroundTintMode=2;
        /**
         * Attributes that can be used with a ViewStubCompat.
         * <p>Includes the following attributes:</p>
         * <table>
         * <colgroup align="left" />
         * <colgroup align="left" />
         * <tr><th>Attribute</th><th>Description</th></tr>
         * <tr><td><code>{@link #ViewStubCompat_android_id android:id}</code></td><td></td></tr>
         * <tr><td><code>{@link #ViewStubCompat_android_layout android:layout}</code></td><td></td></tr>
         * <tr><td><code>{@link #ViewStubCompat_android_inflatedId android:inflatedId}</code></td><td></td></tr>
         * </table>
         * @see #ViewStubCompat_android_id
         * @see #ViewStubCompat_android_layout
         * @see #ViewStubCompat_android_inflatedId
         */
        public static final int[] ViewStubCompat={
            0x010100d0, 0x010100f2, 0x010100f3
          };
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#id}
         * attribute's value can be found in the {@link #ViewStubCompat} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:id
         */
        public static final int ViewStubCompat_android_id=0;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#layout}
         * attribute's value can be found in the {@link #ViewStubCompat} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:layout
         */
        public static final int ViewStubCompat_android_layout=1;
        /**
         * <p>This symbol is the offset where the {@link android.R.attr#inflatedId}
         * attribute's value can be found in the {@link #ViewStubCompat} array.
         *
         * <p>May be a reference to another resource, in the form
         * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
         * attribute in the form
         * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
         *
         * @attr name android:inflatedId
         */
        public static final int ViewStubCompat_android_inflatedId=2;
      }
    }
}
