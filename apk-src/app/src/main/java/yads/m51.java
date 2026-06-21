package yads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m51 extends b0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40803c;

    public m51(Object obj, Object obj2) {
        this.f40802b = obj;
        this.f40803c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40802b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f40803c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
