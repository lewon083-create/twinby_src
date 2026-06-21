package l3;

import android.os.Bundle;
import android.text.Spanned;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f27792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f27793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f27795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27796e;

    static {
        String str = z.f28608a;
        f27792a = Integer.toString(0, 36);
        f27793b = Integer.toString(1, 36);
        f27794c = Integer.toString(2, 36);
        f27795d = Integer.toString(3, 36);
        f27796e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f27792a, spanned.getSpanStart(obj));
        bundle2.putInt(f27793b, spanned.getSpanEnd(obj));
        bundle2.putInt(f27794c, spanned.getSpanFlags(obj));
        bundle2.putInt(f27795d, i);
        if (bundle != null) {
            bundle2.putBundle(f27796e, bundle);
        }
        return bundle2;
    }
}
