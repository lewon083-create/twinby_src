package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h40 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f6022c;

    public h40(Context context) {
        super(context);
        this.f6021b = context;
    }

    public static h40 a(Context context, View view, xp0 xp0Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        h40 h40Var = new h40(context);
        List list = xp0Var.f12264u;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = h40Var.f6021b;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((yp0) list.get(0)).f12679a;
            float f11 = displayMetrics.density;
            h40Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r5.f12680b * f11)));
        }
        h40Var.f6022c = view;
        h40Var.addView(view);
        fp fpVar = p9.k.C.B;
        nx nxVar = new nx(h40Var, h40Var);
        View view2 = (View) ((WeakReference) nxVar.f6568b).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            nxVar.F1(viewTreeObserver);
        }
        mx mxVar = new mx(h40Var, h40Var);
        View view3 = (View) ((WeakReference) mxVar.f6568b).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            mxVar.F1(viewTreeObserver3);
        }
        JSONObject jSONObject = xp0Var.h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            h40Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            h40Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        h40Var.addView(relativeLayout);
        return h40Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f6021b;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", ConfigValue.DOUBLE_DEFAULT_VALUE);
        q9.r rVar = q9.r.f31959g;
        u9.d dVar = rVar.f31960a;
        int iB = u9.d.b(context, (int) dOptDouble);
        textView.setPadding(0, iB, 0, iB);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        u9.d dVar2 = rVar.f31960a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, u9.d.b(context, (int) dOptDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f6022c.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f6022c.setY(-r0[1]);
    }
}
