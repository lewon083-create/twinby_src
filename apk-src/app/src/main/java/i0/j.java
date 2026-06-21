package i0;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enumeration f20782a;

    public j(k kVar) {
        this.f20782a = Collections.enumeration(kVar.f20787a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f20782a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.f20782a.nextElement());
    }
}
