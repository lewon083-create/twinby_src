package yads;

import android.net.Uri;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dv0 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f37893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f37894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f37895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37896h;

    public dv0() {
        super(false);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws cv0 {
        Uri uri = u30Var.f43533a;
        this.f37894f = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f37893e = randomAccessFile;
            try {
                randomAccessFile.seek(u30Var.f43538f);
                long length = u30Var.f43539g;
                if (length == -1) {
                    length = this.f37893e.length() - u30Var.f43538f;
                }
                this.f37895g = length;
                if (length < 0) {
                    throw new cv0(null, null, 2008);
                }
                this.f37896h = true;
                b(u30Var);
                return this.f37895g;
            } catch (IOException e3) {
                throw new cv0(e3, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new cv0(e7, (lb3.f40466a < 21 || !av0.a(e7.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbJ = t.z.j("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbJ.append(fragment);
            throw new cv0(sbJ.toString(), e7, VKApiCodes.CODE_PHONE_ALREADY_USED);
        } catch (SecurityException e10) {
            throw new cv0(e10, 2006);
        } catch (RuntimeException e11) {
            throw new cv0(e11, 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f37894f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f37893e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e3) {
                throw new cv0(e3, 2000);
            }
        } finally {
            this.f37893e = null;
            if (this.f37896h) {
                this.f37896h = false;
                d();
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f37894f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) throws cv0 {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f37895g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f37893e;
            int i11 = lb3.f40466a;
            int i12 = randomAccessFile.read(bArr, i, (int) Math.min(j10, i10));
            if (i12 > 0) {
                this.f37895g -= (long) i12;
                c(i12);
            }
            return i12;
        } catch (IOException e3) {
            throw new cv0(e3, 2000);
        }
    }
}
