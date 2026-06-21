package gl;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f20287g = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl.h f20288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nl.g f20289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f20292f;

    public z(nl.q sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f20288b = sink;
        nl.g gVar = new nl.g();
        this.f20289c = gVar;
        this.f20290d = 16384;
        this.f20292f = new e(gVar);
    }

    public final synchronized void a(c0 peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f20291e) {
                throw new IOException("closed");
            }
            int i = this.f20290d;
            int i10 = peerSettings.f20173a;
            if ((i10 & 32) != 0) {
                i = peerSettings.f20174b[5];
            }
            this.f20290d = i;
            if (((i10 & 2) != 0 ? peerSettings.f20174b[1] : -1) != -1) {
                e eVar = this.f20292f;
                int i11 = (i10 & 2) != 0 ? peerSettings.f20174b[1] : -1;
                eVar.getClass();
                int iMin = Math.min(i11, 16384);
                int i12 = eVar.f20186d;
                if (i12 != iMin) {
                    if (iMin < i12) {
                        eVar.f20184b = Math.min(eVar.f20184b, iMin);
                    }
                    eVar.f20185c = true;
                    eVar.f20186d = iMin;
                    int i13 = eVar.f20190h;
                    if (iMin < i13) {
                        if (iMin == 0) {
                            c[] cVarArr = eVar.f20187e;
                            kotlin.collections.o.i(cVarArr, 0, cVarArr.length);
                            eVar.f20188f = eVar.f20187e.length - 1;
                            eVar.f20189g = 0;
                            eVar.f20190h = 0;
                        } else {
                            eVar.a(i13 - iMin);
                        }
                    }
                }
            }
            d(0, 0, 4, 1);
            this.f20288b.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(boolean z5, int i, nl.g gVar, int i10) {
        if (this.f20291e) {
            throw new IOException("closed");
        }
        d(i, i10, 0, z5 ? 1 : 0);
        if (i10 > 0) {
            nl.h hVar = this.f20288b;
            Intrinsics.b(gVar);
            hVar.write(gVar, i10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f20291e = true;
        this.f20288b.close();
    }

    public final void d(int i, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f20287g;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(false, i, i10, i11, i12));
        }
        if (i10 > this.f20290d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f20290d + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(l7.o.i(i, "reserved bit set: ").toString());
        }
        byte[] bArr = al.b.f1041a;
        nl.h hVar = this.f20288b;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        hVar.writeByte((i10 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte(i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte(i11 & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeByte(i12 & KotlinVersion.MAX_COMPONENT_VALUE);
        hVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.f20291e) {
            throw new IOException("closed");
        }
        this.f20288b.flush();
    }

    public final synchronized void h(int i, b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f20291e) {
            throw new IOException("closed");
        }
        if (errorCode.f20163b == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        d(0, debugData.length + 8, 7, 0);
        this.f20288b.writeInt(i);
        this.f20288b.writeInt(errorCode.f20163b);
        if (debugData.length != 0) {
            this.f20288b.write(debugData);
        }
        this.f20288b.flush();
    }

    public final synchronized void i(boolean z5, int i, ArrayList headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f20291e) {
            throw new IOException("closed");
        }
        this.f20292f.d(headerBlock);
        long j10 = this.f20289c.f29540c;
        long jMin = Math.min(this.f20290d, j10);
        int i10 = j10 == jMin ? 4 : 0;
        if (z5) {
            i10 |= 1;
        }
        d(i, (int) jMin, 1, i10);
        this.f20288b.write(this.f20289c, jMin);
        if (j10 > jMin) {
            long j11 = j10 - jMin;
            while (j11 > 0) {
                long jMin2 = Math.min(this.f20290d, j11);
                j11 -= jMin2;
                d(i, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                this.f20288b.write(this.f20289c, jMin2);
            }
        }
    }

    public final synchronized void j(int i, int i10, boolean z5) {
        if (this.f20291e) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z5 ? 1 : 0);
        this.f20288b.writeInt(i);
        this.f20288b.writeInt(i10);
        this.f20288b.flush();
    }

    public final synchronized void k(int i, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f20291e) {
            throw new IOException("closed");
        }
        if (errorCode.f20163b == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        d(i, 4, 3, 0);
        this.f20288b.writeInt(errorCode.f20163b);
        this.f20288b.flush();
    }

    public final synchronized void l(int i, long j10) {
        if (this.f20291e) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        d(i, 4, 8, 0);
        this.f20288b.writeInt((int) j10);
        this.f20288b.flush();
    }
}
