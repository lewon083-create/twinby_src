package vk;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import uk.a1;
import uk.f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements sk.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f34899b = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34900c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f34901a;

    public y() {
        com.google.android.gms.internal.auth.g.D(j0.f27517a);
        a1 a1Var = a1.f34493a;
        n nVar = n.f34888a;
        a1 kSerializer = a1.f34493a;
        n vSerializer = n.f34888a;
        Intrinsics.checkNotNullParameter(kSerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "valueSerializer");
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        sk.f keyDesc = kSerializer.getDescriptor();
        sk.f valueDesc = vSerializer.getDescriptor();
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f34901a = new f0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // sk.f
    public final String a() {
        return f34900c;
    }

    @Override // sk.f
    public final boolean c() {
        this.f34901a.getClass();
        return false;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f34901a.d(name);
    }

    @Override // sk.f
    public final h5 e() {
        this.f34901a.getClass();
        return sk.i.f32939d;
    }

    @Override // sk.f
    public final int f() {
        this.f34901a.getClass();
        return 2;
    }

    @Override // sk.f
    public final String g(int i) {
        this.f34901a.getClass();
        return String.valueOf(i);
    }

    @Override // sk.f
    public final List getAnnotations() {
        this.f34901a.getClass();
        return kotlin.collections.b0.f27475b;
    }

    @Override // sk.f
    public final List h(int i) {
        return this.f34901a.h(i);
    }

    @Override // sk.f
    public final sk.f i(int i) {
        return this.f34901a.i(i);
    }

    @Override // sk.f
    public final boolean isInline() {
        this.f34901a.getClass();
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        this.f34901a.j(i);
        return false;
    }
}
