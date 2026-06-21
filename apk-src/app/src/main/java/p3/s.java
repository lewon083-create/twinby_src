package p3;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RandomAccessFile f31201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f31202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f31203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f31204u;

    @Override // p3.h
    public final void close() {
        this.f31202s = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f31201r;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e3) {
                throw new r(e3, 2000);
            }
        } finally {
            this.f31201r = null;
            if (this.f31204u) {
                this.f31204u = false;
                transferEnded();
            }
        }
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f31202s;
    }

    @Override // p3.h
    public final long open(l lVar) throws r {
        Uri uri = lVar.f31172a;
        long j10 = lVar.f31177f;
        this.f31202s = uri;
        transferInitializing(lVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f31201r = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = lVar.f31178g;
                if (length == -1) {
                    length = this.f31201r.length() - j10;
                }
                this.f31203t = length;
                if (length < 0) {
                    throw new r(null, null, 2008);
                }
                this.f31204u = true;
                transferStarted(lVar);
                return this.f31203t;
            } catch (IOException e3) {
                throw new r(e3, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new r(e7, ((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbJ = t.z.j("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbJ.append(fragment);
            throw new r(sbJ.toString(), e7, VKApiCodes.CODE_PHONE_ALREADY_USED);
        } catch (SecurityException e10) {
            throw new r(e10, 2006);
        } catch (RuntimeException e11) {
            throw new r(e11, 2000);
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws r {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f31203t;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f31201r;
            String str = m3.z.f28608a;
            int i11 = randomAccessFile.read(bArr, i, (int) Math.min(j10, i10));
            if (i11 > 0) {
                this.f31203t -= (long) i11;
                bytesTransferred(i11);
            }
            return i11;
        } catch (IOException e3) {
            throw new r(e3, 2000);
        }
    }
}
