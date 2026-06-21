package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface ma0 {
    int A();

    void F(String str);

    void P();

    void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(View view);

    JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void d(Bundle bundle);

    void e(q9.l1 l1Var);

    void e0();

    void f(View view, View view2, Map map, Map map2, boolean z5, ImageView.ScaleType scaleType);

    void h(View view);

    void i(co coVar);

    JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void k();

    void l(View view, View view2, Map map, Map map2, boolean z5, ImageView.ScaleType scaleType, int i);

    boolean m();

    void n(Bundle bundle);

    void o(q9.j1 j1Var);

    void p(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void q(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean s(Bundle bundle);

    void t();

    boolean u();

    void v(View view, MotionEvent motionEvent);

    void y();
}
