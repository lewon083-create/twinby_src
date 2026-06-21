package g2;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19828f;

    public a0(int i, Class cls, int i10, int i11, int i12) {
        this.f19828f = i12;
        this.f19836b = i;
        this.f19839e = cls;
        this.f19838d = i10;
        this.f19837c = i11;
    }

    @Override // g2.c0
    public final Object c(View view) {
        switch (this.f19828f) {
            case 0:
                return i0.a(view);
            case 1:
                return k0.b(view);
            default:
                return Boolean.valueOf(i0.b(view));
        }
    }

    @Override // g2.c0
    public final void d(View view, Object obj) {
        switch (this.f19828f) {
            case 0:
                i0.e(view, (CharSequence) obj);
                break;
            case 1:
                k0.c(view, (CharSequence) obj);
                break;
            default:
                i0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // g2.c0
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f19828f) {
            case 0:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
        return !zEquals;
    }
}
