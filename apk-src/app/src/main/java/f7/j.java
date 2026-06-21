package f7;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends r implements Function0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16689h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj, Object obj2) {
        super(0);
        this.f16687f = i;
        this.f16688g = obj;
        this.f16689h = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16687f) {
            case 0:
                ((g7.a) ((b) this.f16688g).f16672c).a((i) this.f16689h);
                return Unit.f27471a;
            case 1:
                SharedPreferences sharedPreferences = ((Context) this.f16688g).getSharedPreferences((String) this.f16689h, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = (Context) this.f16688g;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                String name = ((s2.b) this.f16689h).f32420a;
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                return k3.f.i(applicationContext, name + ".preferences_pb");
        }
    }
}
