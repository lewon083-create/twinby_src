package gl;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f20204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f20205c;

    public l(q qVar, u reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f20205c = qVar;
        this.f20204b = reader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        b bVar;
        Throwable th2;
        q qVar = this.f20205c;
        u uVar = this.f20204b;
        b bVar2 = b.INTERNAL_ERROR;
        IOException e3 = null;
        try {
            try {
                Intrinsics.checkNotNullParameter(this, "handler");
            } catch (IOException e7) {
                e3 = e7;
                bVar = bVar2;
            }
            if (!uVar.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } while (uVar.a(false, this));
            bVar = b.NO_ERROR;
            try {
                try {
                    qVar.a(bVar, b.CANCEL, null);
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (IOException e10) {
                e3 = e10;
                b bVar3 = b.PROTOCOL_ERROR;
                qVar.a(bVar3, bVar3, e3);
            }
            al.b.c(uVar);
            return Unit.f27471a;
        } catch (Throwable th5) {
            th2 = th5;
        }
        bVar = bVar2;
        qVar.a(bVar, bVar2, e3);
        al.b.c(uVar);
        throw th2;
    }
}
