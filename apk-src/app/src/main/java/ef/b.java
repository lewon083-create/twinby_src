package ef;

import hk.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends p implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i, obj, cls, str, str2, i10);
        this.f16360b = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16360b) {
            case 0:
                String p02 = (String) obj;
                Intrinsics.checkNotNullParameter(p02, "p0");
                e eVar = (e) ((c) this.receiver).f16366f.get(p02);
                if (eVar != null) {
                    return eVar.f16377e;
                }
                return null;
            default:
                ((f1) this.receiver).k((Throwable) obj);
                return Unit.f27471a;
        }
    }
}
