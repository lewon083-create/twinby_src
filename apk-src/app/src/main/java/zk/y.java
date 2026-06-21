package zk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f46518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46519c;

    public /* synthetic */ y(p pVar, Object obj, int i) {
        this.f46517a = i;
        this.f46518b = pVar;
        this.f46519c = obj;
    }

    @Override // zk.b0
    public final long contentLength() {
        switch (this.f46517a) {
            case 0:
                return ((File) this.f46519c).length();
            default:
                return ((nl.j) this.f46519c).a();
        }
    }

    @Override // zk.b0
    public final p contentType() {
        switch (this.f46517a) {
        }
        return this.f46518b;
    }

    @Override // zk.b0
    public final void writeTo(nl.h sink) throws IOException {
        int i = this.f46517a;
        Object obj = this.f46519c;
        Intrinsics.checkNotNullParameter(sink, "sink");
        switch (i) {
            case 0:
                File file = (File) obj;
                Logger logger = nl.o.f29555a;
                Intrinsics.checkNotNullParameter(file, "<this>");
                nl.d dVar = new nl.d(new FileInputStream(file), nl.z.f29578d);
                try {
                    sink.o(dVar);
                    dVar.close();
                    return;
                } finally {
                }
            default:
                sink.v((nl.j) obj);
                return;
        }
    }
}
