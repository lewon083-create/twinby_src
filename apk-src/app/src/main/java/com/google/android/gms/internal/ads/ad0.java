package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ad0 extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.i f2871b;

    public ad0(Context context, View view, t9.i iVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f2871b = iVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f2871b.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof sz) {
                arrayList.add((sz) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((sz) arrayList.get(i10)).destroy();
        }
    }
}
