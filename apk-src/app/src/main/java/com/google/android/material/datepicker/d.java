package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.gms.internal.measurement.b4;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd.d f14569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd.d f14570b;

    public d(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.gms.internal.auth.m.u(context, m.class.getCanonicalName(), R.attr.materialCalendarStyle).data, vb.a.f34818j);
        wd.d.b(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        wd.d.b(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        wd.d.b(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        wd.d.b(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListU = b4.u(context, typedArrayObtainStyledAttributes, 6);
        this.f14569a = wd.d.b(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        wd.d.b(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f14570b = wd.d.b(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(colorStateListU.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
