package kotlin.text;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends kotlin.collections.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f27567b;

    public l(o oVar) {
        this.f27567b = oVar;
    }

    @Override // kotlin.collections.a
    public final int a() {
        return this.f27567b.f27570a.groupCount() + 1;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.f27567b.f27570a.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
