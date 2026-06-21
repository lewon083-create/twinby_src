package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep2 f40789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j41 f40790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f40791c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f40792d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f40793e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h41 f40794f;

    public m41(ep2 ep2Var, w82 w82Var) {
        this.f40789a = ep2Var;
        this.f40790b = w82Var;
    }

    public final k41 a(String str, l41 l41Var, int i, int i10) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        ((g03) this).f38613g.getClass();
        String strA = l31.a(str, scaleType);
        Bitmap bitmapA = ((w82) this.f40790b).a(strA);
        if (bitmapA != null) {
            k41 k41Var = new k41(this, bitmapA, null, null);
            l41Var.a(k41Var, true);
            return k41Var;
        }
        k41 k41Var2 = new k41(this, null, strA, l41Var);
        l41Var.a(k41Var2, true);
        i41 i41Var = (i41) this.f40791c.get(strA);
        if (i41Var == null) {
            i41Var = (i41) this.f40792d.get(strA);
        }
        if (i41Var != null) {
            i41Var.f39432d.add(k41Var2);
            return k41Var2;
        }
        q41 q41Var = new q41(str, new f41(this, strA), i, i10, scaleType, Bitmap.Config.RGB_565, new g41(this, strA));
        this.f40789a.a(q41Var);
        this.f40791c.put(strA, new i41(q41Var, k41Var2));
        return k41Var2;
    }
}
