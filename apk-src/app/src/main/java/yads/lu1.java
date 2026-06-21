package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lu1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static lu1 f40684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f40685c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.collections.l f40686a = new kotlin.collections.l();

    public final void a() {
        synchronized (f40685c) {
            this.f40686a.clear();
            Unit unit = Unit.f27471a;
        }
    }

    public final List b() {
        List listR;
        synchronized (f40685c) {
            listR = CollectionsKt.R(this.f40686a);
        }
        return listR;
    }
}
