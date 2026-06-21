package z3;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46141c;

    public p(String str, List list, boolean z5) {
        this.f46139a = str;
        this.f46140b = Collections.unmodifiableList(list);
        this.f46141c = z5;
    }
}
