package yads;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class js implements ks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39960a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f39961b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f39962c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f39963d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk f39964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kq2 f39966g;

    public js(File file) {
        this.f39964e = new gk(file);
    }

    @Override // yads.ks
    public final void a(long j10) {
    }

    @Override // yads.ks
    public final void b() {
        gk gkVar = this.f39964e;
        gkVar.f38780a.delete();
        gkVar.f38781b.delete();
    }

    @Override // yads.ks
    public final boolean a() {
        gk gkVar = this.f39964e;
        return gkVar.f38780a.exists() || gkVar.f38781b.exists();
    }

    public static int a(hs hsVar, int i) {
        int iHashCode = hsVar.f39298b.hashCode() + (hsVar.f39297a * 31);
        if (i < 2) {
            long jA = qz.a(hsVar.f39301e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return hsVar.f39301e.hashCode() + (iHashCode * 31);
    }

    @Override // yads.ks
    public final void b(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        kq2 kq2Var;
        DataOutputStream dataOutputStream2 = null;
        try {
            fk fkVarB = this.f39964e.b();
            kq2 kq2Var2 = this.f39966g;
            if (kq2Var2 == null) {
                this.f39966g = new kq2(fkVarB);
            } else {
                kq2Var2.a(fkVarB);
            }
            kq2Var = this.f39966g;
            dataOutputStream = new DataOutputStream(kq2Var);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.f39960a ? 1 : 0);
            if (this.f39960a) {
                byte[] bArr = new byte[16];
                SecureRandom secureRandom = this.f39963d;
                int i = lb3.f40466a;
                secureRandom.nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.f39961b.init(1, this.f39962c, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(kq2Var, this.f39961b));
                } catch (InvalidAlgorithmParameterException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e7) {
                    e = e7;
                    throw new IllegalStateException(e);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            lb3.a((Closeable) dataOutputStream);
            throw th;
        }
        try {
            dataOutputStream.writeInt(map.size());
            int iA = 0;
            for (hs hsVar : map.values()) {
                dataOutputStream.writeInt(hsVar.f39297a);
                dataOutputStream.writeUTF(hsVar.f39298b);
                Set<Map.Entry> setEntrySet = hsVar.f39301e.f39822b.entrySet();
                dataOutputStream.writeInt(setEntrySet.size());
                for (Map.Entry entry : setEntrySet) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    byte[] bArr2 = (byte[]) entry.getValue();
                    dataOutputStream.writeInt(bArr2.length);
                    dataOutputStream.write(bArr2);
                }
                iA += a(hsVar, 2);
            }
            dataOutputStream.writeInt(iA);
            gk gkVar = this.f39964e;
            gkVar.getClass();
            dataOutputStream.close();
            gkVar.f38781b.delete();
            int i10 = lb3.f40466a;
            this.f39965f = false;
        } catch (Throwable th4) {
            th = th4;
            dataOutputStream2 = dataOutputStream;
            dataOutputStream = dataOutputStream2;
            lb3.a((Closeable) dataOutputStream);
            throw th;
        }
    }

    @Override // yads.ks
    public final void a(HashMap map, SparseArray sparseArray) throws Throwable {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        if (!this.f39965f) {
            gk gkVar = this.f39964e;
            if (gkVar.f38780a.exists() || gkVar.f38781b.exists()) {
                DataInputStream dataInputStream2 = null;
                try {
                    bufferedInputStream = new BufferedInputStream(this.f39964e.a());
                    dataInputStream = new DataInputStream(bufferedInputStream);
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    int i = dataInputStream.readInt();
                    if (i >= 0 && i <= 2) {
                        if ((dataInputStream.readInt() & 1) != 0) {
                            if (this.f39961b != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    Cipher cipher = this.f39961b;
                                    SecretKeySpec secretKeySpec = this.f39962c;
                                    int i10 = lb3.f40466a;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f39961b));
                                } catch (InvalidAlgorithmParameterException e3) {
                                    e = e3;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e7) {
                                    e = e7;
                                    throw new IllegalStateException(e);
                                }
                            } else {
                                lb3.a((Closeable) dataInputStream);
                            }
                        } else if (this.f39960a) {
                            this.f39965f = true;
                        }
                        int i11 = dataInputStream.readInt();
                        int iA = 0;
                        for (int i12 = 0; i12 < i11; i12++) {
                            hs hsVarA = a(i, dataInputStream);
                            map.put(hsVarA.f39298b, hsVarA);
                            sparseArray.put(hsVarA.f39297a, hsVarA.f39298b);
                            iA += a(hsVarA, i);
                        }
                        int i13 = dataInputStream.readInt();
                        boolean z5 = dataInputStream.read() == -1;
                        if (i13 == iA && z5) {
                            lb3.a((Closeable) dataInputStream);
                            return;
                        }
                        lb3.a((Closeable) dataInputStream);
                    } else {
                        lb3.a((Closeable) dataInputStream);
                    }
                } catch (IOException unused2) {
                    dataInputStream2 = dataInputStream;
                    if (dataInputStream2 != null) {
                        lb3.a((Closeable) dataInputStream2);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream2 = dataInputStream;
                    if (dataInputStream2 != null) {
                        lb3.a((Closeable) dataInputStream2);
                    }
                    throw th;
                }
                map.clear();
                sparseArray.clear();
                gk gkVar2 = this.f39964e;
                gkVar2.f38780a.delete();
                gkVar2.f38781b.delete();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // yads.ks
    public final void a(hs hsVar, boolean z5) {
        this.f39965f = true;
    }

    @Override // yads.ks
    public final void a(hs hsVar) {
        this.f39965f = true;
    }

    public static hs a(int i, DataInputStream dataInputStream) throws IOException {
        jc0 jc0VarA;
        int i10 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j10 = dataInputStream.readLong();
            rz rzVar = new rz();
            rzVar.f42766a.put("exo_len", Long.valueOf(j10));
            rzVar.f42767b.remove("exo_len");
            jc0VarA = jc0.f39820c.a(rzVar);
        } else {
            jc0VarA = ls.a(dataInputStream);
        }
        return new hs(i10, utf, jc0VarA);
    }

    @Override // yads.ks
    public final void a(HashMap map) throws Throwable {
        if (this.f39965f) {
            b(map);
        }
    }
}
