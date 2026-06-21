package vk;

import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements sk.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f34880b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34881c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uk.b f34882a;

    public g() {
        n element = n.f34888a;
        Intrinsics.checkNotNullParameter(element, "elementSerializer");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        sk.f elementDesc = element.getDescriptor();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f34882a = new uk.b(elementDesc);
    }

    @Override // sk.f
    public final String a() {
        return f34881c;
    }

    @Override // sk.f
    public final boolean c() {
        this.f34882a.getClass();
        return false;
    }

    @Override // sk.f
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f34882a.d(name);
    }

    @Override // sk.f
    public final h5 e() {
        this.f34882a.getClass();
        return sk.i.f32938c;
    }

    @Override // sk.f
    public final int f() {
        this.f34882a.getClass();
        return 1;
    }

    @Override // sk.f
    public final String g(int i) {
        this.f34882a.getClass();
        return String.valueOf(i);
    }

    @Override // sk.f
    public final List getAnnotations() {
        this.f34882a.getClass();
        return kotlin.collections.b0.f27475b;
    }

    @Override // sk.f
    public final List h(int i) {
        return this.f34882a.h(i);
    }

    @Override // sk.f
    public final sk.f i(int i) {
        return this.f34882a.i(i);
    }

    @Override // sk.f
    public final boolean isInline() {
        this.f34882a.getClass();
        return false;
    }

    @Override // sk.f
    public final boolean j(int i) {
        this.f34882a.j(i);
        return false;
    }
}
