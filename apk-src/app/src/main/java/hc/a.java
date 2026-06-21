package hc;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.gms.internal.auth.g;
import com.google.android.gms.internal.auth.m;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f20474f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20479e;

    public a(Context context) {
        TypedValue typedValueT = m.t(context, R.attr.elevationOverlayEnabled);
        boolean z5 = (typedValueT == null || typedValueT.type != 18 || typedValueT.data == 0) ? false : true;
        int iO = g.o(context, R.attr.elevationOverlayColor, 0);
        int iO2 = g.o(context, R.attr.elevationOverlayAccentColor, 0);
        int iO3 = g.o(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f20475a = z5;
        this.f20476b = iO;
        this.f20477c = iO2;
        this.f20478d = iO3;
        this.f20479e = f10;
    }
}
