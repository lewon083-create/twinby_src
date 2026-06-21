package y3;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p3.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p3.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.h f36300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f36301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f36302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CipherInputStream f36303e;

    public a(p3.h hVar, byte[] bArr, byte[] bArr2) {
        this.f36300b = hVar;
        this.f36301c = bArr;
        this.f36302d = bArr2;
    }

    @Override // p3.h
    public final void addTransferListener(e0 e0Var) {
        e0Var.getClass();
        this.f36300b.addTransferListener(e0Var);
    }

    @Override // p3.h
    public final void close() {
        if (this.f36303e != null) {
            this.f36303e = null;
            this.f36300b.close();
        }
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        return this.f36300b.getResponseHeaders();
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f36300b.getUri();
    }

    @Override // p3.h
    public final long open(p3.l lVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f36301c, "AES"), new IvParameterSpec(this.f36302d));
                p3.j jVar = new p3.j(this.f36300b, lVar);
                this.f36303e = new CipherInputStream(jVar, cipher);
                jVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        this.f36303e.getClass();
        int i11 = this.f36303e.read(bArr, i, i10);
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }
}
