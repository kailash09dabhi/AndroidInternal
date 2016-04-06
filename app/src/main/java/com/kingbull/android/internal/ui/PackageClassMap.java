package com.kingbull.android.internal.ui;

import android.os.Build;
import android.support.v7.widget.ActivityChooserView;
import android.widget.*;

import java.util.HashMap;

/**
 * Created by Kailash Dabhi on 06-04-2016.
 * You can contact us at kailash09dabhi@gmail.com OR on skype(kailash.09)
 * Copyright (c) 2016 Kingbull Technology. All rights reserved.
 */
public class PackageClassMap {
    public static final HashMap<String, Class> ANDROID_WIDGET_CLASS_MAP = new HashMap<String, Class>() {
        {
            put("android.widget.AbsListView", AbsListView.class);
            put("android.widget.AbsSeekBar", AbsSeekBar.class);
            put("android.widget.AbsSpinner", AbsSpinner.class);
            put("android.widget.AbsoluteLayout", AbsoluteLayout.class);
            put("android.widget.ActivityChooserView", ActivityChooserView.class);
            put("android.widget.Adapter", Adapter.class);
            put("android.widget.AdapterView", AdapterView.class);
            put("android.widget.AdapterViewAnimator", AdapterViewAnimator.class);
            put("android.widget.AdapterViewFlipper", AdapterViewFlipper.class);
            put("android.widget.Advanceable", Advanceable.class);
            put("android.widget.AlphabetIndexer", AlphabetIndexer.class);
            put("android.widget.AnalogClock", AnalogClock.class);
            put("android.widget.ArrayAdapter", ArrayAdapter.class);
            put("android.widget.AutoCompleteTextView", AutoCompleteTextView.class);
            put("android.widget.BaseAdapter", BaseAdapter.class);
            put("android.widget.BaseExpandableListAdapter", BaseExpandableListAdapter.class);
            put("android.widget.BaseExpandableListAdapter", AutoCompleteTextView.class);
            put("android.widget.Button", Button.class);
            put("android.widget.CalendarView", CalendarView.class);
            put("android.widget.CheckBox", CheckBox.class);
            put("android.widget.Checkable", Checkable.class);
            put("android.widget.CheckedTextView", CheckedTextView.class);
            put("android.widget.Chronometer", Chronometer.class);
            put("android.widget.CompoundButton", CompoundButton.class);
            put("android.widget.CursorAdapter", CursorAdapter.class);
            put("android.widget.CursorTreeAdapter", CursorTreeAdapter.class);
            put("android.widget.DatePicker", DatePicker.class);
            put("android.widget.DialerFilter", DialerFilter.class);
            put("android.widget.DigitalClock", DigitalClock.class);
            put("android.widget.EdgeEffect", EdgeEffect.class);
            put("android.widget.EditText", EditText.class);
            put("android.widget.ExpandableListAdapter", ExpandableListAdapter.class);
            put("android.widget.ExpandableListView", ExpandableListView.class);
            put("android.widget.Filter", Filter.class);
            put("android.widget.Filterable", Filterable.class);
            put("android.widget.FrameLayout", FrameLayout.class);
            put("android.widget.Filter", Filter.class);
            put("android.widget.Gallery", Gallery.class);
            put("android.widget.GridLayout", GridLayout.class);
            put("android.widget.GridView", GridView.class);
            put("android.widget.HeaderViewListAdapter", HeaderViewListAdapter.class);
            put("android.widget.HeterogeneousExpandableList", HeterogeneousExpandableList.class);
            put("android.widget.HorizontalScrollView", HorizontalScrollView.class);
            put("android.widget.ImageButton", ImageButton.class);
            put("android.widget.ImageSwitcher", ImageSwitcher.class);
            put("android.widget.ImageView", ImageView.class);
            put("android.widget.LinearLayout", LinearLayout.class);
            put("android.widget.ListAdapter", ListAdapter.class);
            put("android.widget.ListPopupWindow", ListPopupWindow.class);
            put("android.widget.ListView", ListView.class);
            put("android.widget.MediaController", MediaController.class);
            put("android.widget.MultiAutoCompleteTextView", MultiAutoCompleteTextView.class);
            put("android.widget.NumberPicker", NumberPicker.class);
            put("android.widget.OverScroller", OverScroller.class);
            put("android.widget.PopupMenu", PopupMenu.class);
            put("android.widget.PopupWindow", PopupWindow.class);
            put("android.widget.ProgressBar", ProgressBar.class);
            put("android.widget.QuickContactBadge", QuickContactBadge.class);
            put("android.widget.RadioButton", RadioButton.class);
            put("android.widget.RadioGroup", RadioGroup.class);
            put("android.widget.RatingBar", RatingBar.class);
            put("android.widget.RelativeLayout", RelativeLayout.class);
            put("android.widget.RemoteViews", RemoteViews.class);
            put("android.widget.ResourceCursorAdapter", ResourceCursorAdapter.class);
            put("android.widget.ResourceCursorTreeAdapter", ResourceCursorTreeAdapter.class);
            put("android.widget.ScrollView", ScrollView.class);
            put("android.widget.Scroller", Scroller.class);
            put("android.widget.SearchView", SearchView.class);
            put("android.widget.SectionIndexer", SectionIndexer.class);
            put("android.widget.SeekBar", SeekBar.class);
            put("android.widget.ShareActionProvider", ShareActionProvider.class);
            put("android.widget.SimpleAdapter", SimpleAdapter.class);
            put("android.widget.SimpleCursorAdapter", SimpleCursorAdapter.class);
            put("android.widget.SimpleCursorTreeAdapter", SimpleCursorTreeAdapter.class);
            put("android.widget.SimpleExpandableListAdapter", SimpleExpandableListAdapter.class);
            put("android.widget.SlidingDrawer", SlidingDrawer.class);
            put("android.widget.Space", Space.class);
            put("android.widget.Spinner", Spinner.class);
            put("android.widget.SpinnerAdapter", SpinnerAdapter.class);
            put("android.widget.StackView", StackView.class);
            put("android.widget.Switch", Switch.class);
            put("android.widget.TabHost", TabHost.class);
            put("android.widget.TabWidget", TabWidget.class);
            put("android.widget.TableLayout", TableLayout.class);
            put("android.widget.TableRow", TableRow.class);
            put("android.widget.TextClock", TextClock.class);
            put("android.widget.TextSwitcher", TextSwitcher.class);
            put("android.widget.TextView", TextView.class);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                put("android.widget.ThemedSpinnerAdapter", ThemedSpinnerAdapter.class);
            put("android.widget.TimePicker", TimePicker.class);
            put("android.widget.Toast", Toast.class);
            put("android.widget.ToggleButton", ToggleButton.class);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                put("android.widget.Toolbar", Toolbar.class);
            put("android.widget.TwoLineListItem", TwoLineListItem.class);
            put("android.widget.VideoView", VideoView.class);
            put("android.widget.ViewAnimator", ViewAnimator.class);
            put("android.widget.ViewFlipper", ViewFlipper.class);
            put("android.widget.ViewSwitcher", ViewSwitcher.class);
            put("android.widget.WrapperListAdapter", WrapperListAdapter.class);
            put("android.widget.ZoomButton", ZoomButton.class);
            put("android.widget.ZoomButtonsController", ZoomButtonsController.class);
            put("android.widget.ZoomControls", ZoomControls.class);
            put("android.widget.ZoomButtonsController", ZoomButtonsController.class);
            put("android.widget.ZoomButtonsController", ZoomButtonsController.class);
            put("android.widget.ZoomButtonsController", ZoomButtonsController.class);

        }
    };


}
