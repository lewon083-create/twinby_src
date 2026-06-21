package p3;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f31131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f31133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f31134e;

    public c0(h hVar) {
        hVar.getClass();
        this.f31131b = hVar;
        this.f31133d = Uri.EMPTY;
        this.f31134e = Collections.EMPTY_MAP;
    }

    @Override // p3.h
    public final void addTransferListener(e0 e0Var) {
        e0Var.getClass();
        this.f31131b.addTransferListener(e0Var);
    }

    @Override // p3.h
    public final void close() {
        this.f31131b.close();
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        return this.f31131b.getResponseHeaders();
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f31131b.getUri();
    }

    @Override // p3.h
    public final long open(l lVar) {
        h hVar = this.f31131b;
        this.f31133d = lVar.f31172a;
        this.f31134e = Collections.EMPTY_MAP;
        try {
            return hVar.open(lVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f31133d = uri;
            }
            this.f31134e = hVar.getResponseHeaders();
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) {
        int i11 = this.f31131b.read(bArr, i, i10);
        if (i11 != -1) {
            this.f31132c += (long) i11;
        }
        return i11;
    }
}
