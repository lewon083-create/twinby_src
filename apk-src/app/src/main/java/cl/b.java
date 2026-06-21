package cl;

import dl.j;
import dl.k;
import gl.q;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2400f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.f2399e = i;
        this.f2400f = obj;
    }

    @Override // cl.a
    public final long a() {
        int i = 0;
        switch (this.f2399e) {
            case 0:
                ((Function0) this.f2400f).invoke();
                return -1L;
            case 1:
                k kVar = (k) this.f2400f;
                long jNanoTime = System.nanoTime();
                long j10 = Long.MIN_VALUE;
                j jVar = null;
                int i10 = 0;
                for (j connection : (ConcurrentLinkedQueue) kVar.f15874e) {
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (kVar.c(connection, jNanoTime) > 0) {
                            i10++;
                        } else {
                            i++;
                            long j11 = jNanoTime - connection.f15867q;
                            if (j11 > j10) {
                                jVar = connection;
                                j10 = j11;
                            }
                            Unit unit = Unit.f27471a;
                        }
                    }
                }
                long j12 = kVar.f15871b;
                if (j10 < j12 && i <= 5) {
                    if (i > 0) {
                        return j12 - j10;
                    }
                    if (i10 > 0) {
                        return j12;
                    }
                    return -1L;
                }
                Intrinsics.b(jVar);
                synchronized (jVar) {
                    if (!jVar.f15866p.isEmpty()) {
                        return 0L;
                    }
                    if (jVar.f15867q + j10 != jNanoTime) {
                        return 0L;
                    }
                    jVar.f15860j = true;
                    ((ConcurrentLinkedQueue) kVar.f15874e).remove(jVar);
                    Socket socket = jVar.f15855d;
                    Intrinsics.b(socket);
                    al.b.d(socket);
                    if (!((ConcurrentLinkedQueue) kVar.f15874e).isEmpty()) {
                        return 0L;
                    }
                    ((c) kVar.f15872c).a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f2400f;
                qVar.getClass();
                try {
                    qVar.f20242x.j(2, 0, false);
                    break;
                } catch (IOException e3) {
                    qVar.b(e3);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, String str) {
        super(str, true);
        this.f2399e = 1;
        this.f2400f = kVar;
    }
}
