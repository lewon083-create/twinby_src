package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ug0 implements mr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f43645a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f43646b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rg0 f43647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43648d;

    public ug0(File file, int i) {
        this.f43647c = new rg0(file);
        this.f43648d = i;
    }

    @Override // yads.mr
    public final synchronized void a() {
        long length;
        tg0 tg0Var;
        File file = this.f43647c.f42595a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z5 = om3.f41652a;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                try {
                    length = file2.length();
                    tg0Var = new tg0(new BufferedInputStream(new FileInputStream(file2)), length);
                } catch (IOException unused) {
                    file2.delete();
                } catch (Throwable unused2) {
                    file2.delete();
                }
            } catch (Throwable unused3) {
            }
            try {
                sg0 sg0VarA = sg0.a(tg0Var);
                sg0VarA.f42932a = length;
                String str = sg0VarA.f42933b;
                if (this.f43645a.containsKey(str)) {
                    this.f43646b = (sg0VarA.f42932a - ((sg0) this.f43645a.get(str)).f42932a) + this.f43646b;
                } else {
                    this.f43646b += sg0VarA.f42932a;
                }
                this.f43645a.put(str, sg0VarA);
                tg0Var.close();
            } catch (Throwable th2) {
                tg0Var.close();
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.f43646b < this.f43648d) {
            return;
        }
        boolean z5 = om3.f41652a;
        SystemClock.elapsedRealtime();
        Iterator it = this.f43645a.entrySet().iterator();
        while (it.hasNext()) {
            sg0 sg0Var = (sg0) ((Map.Entry) it.next()).getValue();
            String str = sg0Var.f42933b;
            File file = this.f43647c.f42595a;
            int length = str.length() / 2;
            StringBuilder sbJ = pe.a.j(String.valueOf(str.substring(0, length).hashCode()));
            sbJ.append(String.valueOf(str.substring(length).hashCode()));
            if (new File(file, sbJ.toString()).delete()) {
                this.f43646b -= sg0Var.f42932a;
            } else {
                String str2 = sg0Var.f42933b;
                int length2 = str2.length() / 2;
                String.valueOf(str2.substring(0, length2).hashCode());
                String.valueOf(str2.substring(length2).hashCode());
            }
            it.remove();
            if (this.f43646b < this.f43648d * 0.9f) {
                break;
            }
        }
        if (om3.f41652a) {
            SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.mr
    public final synchronized lr get(String str) {
        sg0 sg0Var = (sg0) this.f43645a.get(str);
        if (sg0Var == null) {
            return null;
        }
        File file = this.f43647c.f42595a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            tg0 tg0Var = new tg0(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, sg0.a(tg0Var).f42933b)) {
                    return sg0Var.a(a(tg0Var, tg0Var.f43319a - tg0Var.f43320b));
                }
                file2.getAbsolutePath();
                boolean z5 = om3.f41652a;
                sg0 sg0Var2 = (sg0) this.f43645a.remove(str);
                if (sg0Var2 != null) {
                    this.f43646b -= sg0Var2.f42932a;
                }
                return null;
            } finally {
                tg0Var.close();
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z10 = om3.f41652a;
            b(str);
            return null;
        }
    }

    @Override // yads.mr
    public final synchronized void a(String str) {
        lr lrVar = get(str);
        if (lrVar != null) {
            lrVar.f40643f = 0L;
            lrVar.f40642e = 0L;
            a(str, lrVar);
        }
    }

    public static long b(InputStream inputStream) {
        int i = inputStream.read();
        if (i != -1) {
            long j10 = ((long) i) & 255;
            int i10 = inputStream.read();
            if (i10 != -1) {
                long j11 = j10 | ((((long) i10) & 255) << 8);
                int i11 = inputStream.read();
                if (i11 != -1) {
                    long j12 = j11 | ((((long) i11) & 255) << 16);
                    int i12 = inputStream.read();
                    if (i12 != -1) {
                        long j13 = j12 | ((((long) i12) & 255) << 24);
                        int i13 = inputStream.read();
                        if (i13 != -1) {
                            long j14 = j13 | ((((long) i13) & 255) << 32);
                            int i14 = inputStream.read();
                            if (i14 != -1) {
                                long j15 = j14 | ((((long) i14) & 255) << 40);
                                int i15 = inputStream.read();
                                if (i15 != -1) {
                                    long j16 = j15 | ((((long) i15) & 255) << 48);
                                    int i16 = inputStream.read();
                                    if (i16 != -1) {
                                        return ((((long) i16) & 255) << 56) | j16;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // yads.mr
    public final synchronized void a(String str, lr lrVar) {
        BufferedOutputStream bufferedOutputStream;
        sg0 sg0Var;
        long length = this.f43646b + ((long) lrVar.f40638a.length);
        int i = this.f43648d;
        if (length <= i || r2.length <= i * 0.9f) {
            File file = this.f43647c.f42595a;
            int length2 = str.length() / 2;
            File file2 = new File(file, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                sg0Var = new sg0(str, lrVar.f40639b, lrVar.f40640c, lrVar.f40641d, lrVar.f40642e, lrVar.f40643f, sg0.a(lrVar));
            } catch (IOException unused) {
                if (!file2.delete()) {
                    file2.getAbsolutePath();
                    boolean z5 = om3.f41652a;
                }
                if (!this.f43647c.f42595a.exists()) {
                    boolean z10 = om3.f41652a;
                    this.f43645a.clear();
                    this.f43646b = 0L;
                    a();
                }
            }
            if (sg0Var.a(bufferedOutputStream)) {
                bufferedOutputStream.write(lrVar.f40638a);
                bufferedOutputStream.close();
                sg0Var.f42932a = file2.length();
                if (!this.f43645a.containsKey(str)) {
                    this.f43646b += sg0Var.f42932a;
                } else {
                    this.f43646b = (sg0Var.f42932a - ((sg0) this.f43645a.get(str)).f42932a) + this.f43646b;
                }
                this.f43645a.put(str, sg0Var);
                b();
                return;
            }
            bufferedOutputStream.close();
            file2.getAbsolutePath();
            boolean z11 = om3.f41652a;
            throw new IOException();
        }
    }

    public final synchronized void b(String str) {
        try {
            File file = this.f43647c.f42595a;
            int length = str.length() / 2;
            boolean zDelete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            sg0 sg0Var = (sg0) this.f43645a.remove(str);
            if (sg0Var != null) {
                this.f43646b -= sg0Var.f42932a;
            }
            if (!zDelete) {
                int length2 = str.length() / 2;
                String.valueOf(str.substring(0, length2).hashCode());
                String.valueOf(str.substring(length2).hashCode());
                boolean z5 = om3.f41652a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int a(InputStream inputStream) {
        int i = inputStream.read();
        if (i != -1) {
            int i10 = inputStream.read();
            if (i10 != -1) {
                int i11 = i | (i10 << 8);
                int i12 = inputStream.read();
                if (i12 != -1) {
                    int i13 = i11 | (i12 << 16);
                    int i14 = inputStream.read();
                    if (i14 != -1) {
                        return (i14 << 24) | i13;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static byte[] a(tg0 tg0Var, long j10) throws IOException {
        long j11 = tg0Var.f43319a - tg0Var.f43320b;
        if (j10 >= 0 && j10 <= j11) {
            int i = (int) j10;
            if (i == j10) {
                byte[] bArr = new byte[i];
                new DataInputStream(tg0Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbN = gf.a.n("streamToBytes length=", ", maxLength=", j10);
        sbN.append(j11);
        throw new IOException(sbN.toString());
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j10) {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }
}
