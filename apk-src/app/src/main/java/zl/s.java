package zl;

import android.graphics.Bitmap;
import java.util.List;
import yads.af;
import yads.af0;
import yads.ew0;
import yads.ew1;
import yads.ff0;
import yads.if0;
import yads.k73;
import yads.kb0;
import yads.of1;
import yads.pf1;
import yads.qe2;
import yads.rj3;
import yads.t31;
import yads.u31;
import yads.x31;
import yads.ye;
import yads.yv1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements ff0, of1, pf1, t31, ew1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46634d;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f46632b = i;
        this.f46633c = obj;
        this.f46634d = obj2;
    }

    @Override // yads.ff0
    public List a(int i, k73 k73Var, int[] iArr) {
        switch (this.f46632b) {
            case 0:
                return if0.a((af0) this.f46633c, (String) this.f46634d, i, k73Var, iArr);
            default:
                return if0.a((af0) this.f46633c, (int[]) this.f46634d, i, k73Var, iArr);
        }
    }

    public void b(Bitmap bitmap) {
        x31.a((u31) this.f46633c, (x31) this.f46634d, bitmap);
    }

    public void c(String str) {
        yv1.a((yv1) this.f46633c, (String) this.f46634d, str);
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        switch (this.f46632b) {
            case 2:
                ((af) obj).getClass();
                break;
            case 3:
                ((af) obj).getClass();
                break;
            case 4:
                ((af) obj).getClass();
                break;
            case 5:
                ((af) obj).getClass();
                break;
            case 6:
                ((af) obj).getClass();
                break;
            case 7:
                ((af) obj).getClass();
                break;
            case 8:
            default:
                ((af) obj).getClass();
                break;
            case 9:
                kb0.a((ye) this.f46633c, (rj3) this.f46634d, (af) obj);
                break;
            case 10:
                ((af) obj).getClass();
                break;
        }
    }

    @Override // yads.pf1
    public void a(Object obj, ew0 ew0Var) {
        ((kb0) this.f46633c).a((qe2) this.f46634d, (af) obj, ew0Var);
    }
}
