package gl;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f20259e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl.i f20260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f20261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f20262d;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f20259e = logger;
    }

    public u(nl.r source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f20260b = source;
        t tVar = new t(source);
        this.f20261c = tVar;
        this.f20262d = new d(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0245, code lost:
    
        throw new java.io.IOException(l7.o.i(r15, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r19, gl.l r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.u.a(boolean, gl.l):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
    
        if (r8 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
    
        r4.i(al.b.f1042b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(gl.l r19, int r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.u.b(gl.l, int, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20260b.close();
    }

    public final List d(int i, int i10, int i11, int i12) throws IOException {
        t tVar = this.f20261c;
        tVar.f20257f = i;
        tVar.f20254c = i;
        tVar.f20258g = i10;
        tVar.f20255d = i11;
        tVar.f20256e = i12;
        d dVar = this.f20262d;
        nl.r rVar = dVar.f20177c;
        ArrayList arrayList = dVar.f20176b;
        while (!rVar.a()) {
            byte b2 = rVar.readByte();
            byte[] bArr = al.b.f1041a;
            int i13 = b2 & 255;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((b2 & 128) == 128) {
                int iE = dVar.e(i13, 127);
                int i14 = iE - 1;
                if (i14 >= 0) {
                    c[] cVarArr = f.f20191a;
                    if (i14 <= cVarArr.length - 1) {
                        arrayList.add(cVarArr[i14]);
                    }
                }
                int length = dVar.f20179e + 1 + (i14 - f.f20191a.length);
                if (length >= 0) {
                    c[] cVarArr2 = dVar.f20178d;
                    if (length < cVarArr2.length) {
                        c cVar = cVarArr2[length];
                        Intrinsics.b(cVar);
                        arrayList.add(cVar);
                    }
                }
                throw new IOException(l7.o.i(iE, "Header index too large "));
            }
            if (i13 == 64) {
                c[] cVarArr3 = f.f20191a;
                nl.j jVarD = dVar.d();
                f.a(jVarD);
                dVar.c(new c(jVarD, dVar.d()));
            } else if ((b2 & 64) == 64) {
                dVar.c(new c(dVar.b(dVar.e(i13, 63) - 1), dVar.d()));
            } else if ((b2 & 32) == 32) {
                int iE2 = dVar.e(i13, 31);
                dVar.f20175a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + dVar.f20175a);
                }
                int i15 = dVar.f20181g;
                if (iE2 < i15) {
                    if (iE2 == 0) {
                        c[] cVarArr4 = dVar.f20178d;
                        kotlin.collections.o.i(cVarArr4, 0, cVarArr4.length);
                        dVar.f20179e = dVar.f20178d.length - 1;
                        dVar.f20180f = 0;
                        dVar.f20181g = 0;
                    } else {
                        dVar.a(i15 - iE2);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                c[] cVarArr5 = f.f20191a;
                nl.j jVarD2 = dVar.d();
                f.a(jVarD2);
                arrayList.add(new c(jVarD2, dVar.d()));
            } else {
                arrayList.add(new c(dVar.b(dVar.e(i13, 15) - 1), dVar.d()));
            }
        }
        List listR = CollectionsKt.R(arrayList);
        arrayList.clear();
        return listR;
    }

    public final void h(l lVar, int i, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i12 = 0;
        int i13 = 1;
        boolean z5 = (i10 & 1) != 0;
        if ((i10 & 8) != 0) {
            byte b2 = this.f20260b.readByte();
            byte[] bArr = al.b.f1041a;
            i12 = b2 & 255;
        }
        if ((i10 & 32) != 0) {
            nl.i iVar = this.f20260b;
            iVar.readInt();
            iVar.readByte();
            byte[] bArr2 = al.b.f1041a;
            i -= 5;
        }
        List requestHeaders = d(s.a(i, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        q qVar = lVar.f20205c;
        if (i11 != 0 && (i11 & 1) == 0) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            qVar.f20228j.c(new n(qVar.f20223d + '[' + i11 + "] onHeaders", qVar, i11, requestHeaders, z5), 0L);
            return;
        }
        synchronized (qVar) {
            y yVarD = qVar.d(i11);
            if (yVarD != null) {
                Unit unit = Unit.f27471a;
                yVarD.i(al.b.t(requestHeaders), z5);
                return;
            }
            if (qVar.f20226g) {
                return;
            }
            if (i11 <= qVar.f20224e) {
                return;
            }
            if (i11 % 2 == qVar.f20225f % 2) {
                return;
            }
            y yVar = new y(i11, qVar, false, z5, al.b.t(requestHeaders));
            qVar.f20224e = i11;
            qVar.f20222c.put(Integer.valueOf(i11), yVar);
            qVar.f20227h.e().c(new j(i13, qVar, yVar, qVar.f20223d + '[' + i11 + "] onStream"), 0L);
        }
    }

    public final void i(l lVar, int i, int i10, int i11) throws IOException {
        int i12;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i10 & 8) != 0) {
            byte b2 = this.f20260b.readByte();
            byte[] bArr = al.b.f1041a;
            i12 = b2 & 255;
        } else {
            i12 = 0;
        }
        int i13 = this.f20260b.readInt() & Integer.MAX_VALUE;
        List requestHeaders = d(s.a(i - 4, i10, i12), i12, i10, i11);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        q qVar = lVar.f20205c;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (qVar) {
            if (qVar.f20244z.contains(Integer.valueOf(i13))) {
                qVar.l(i13, b.PROTOCOL_ERROR);
                return;
            }
            qVar.f20244z.add(Integer.valueOf(i13));
            qVar.f20228j.c(new n(qVar.f20223d + '[' + i13 + "] onRequest", qVar, i13, requestHeaders), 0L);
        }
    }
}
