package k6;

import android.graphics.Rect;
import android.view.View;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.i f27086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27087b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f27088c = new Rect();

    public h0(androidx.recyclerview.widget.i iVar) {
        this.f27086a = iVar;
    }

    public static h0 a(androidx.recyclerview.widget.i iVar, int i) {
        if (i == 0) {
            return new g0(iVar, 0);
        }
        if (i == 1) {
            return new g0(iVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);
}
