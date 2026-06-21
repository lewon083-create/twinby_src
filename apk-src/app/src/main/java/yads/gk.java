package yads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f38780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f38781b;

    public gk(File file) {
        this.f38780a = file;
        this.f38781b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f38781b.exists()) {
            this.f38780a.delete();
            this.f38781b.renameTo(this.f38780a);
        }
        return new FileInputStream(this.f38780a);
    }

    public final fk b() throws IOException {
        if (this.f38780a.exists()) {
            if (this.f38781b.exists()) {
                this.f38780a.delete();
            } else if (!this.f38780a.renameTo(this.f38781b)) {
                kh1.d("AtomicFile", "Couldn't rename file " + this.f38780a + " to backup file " + this.f38781b);
            }
        }
        try {
            return new fk(this.f38780a);
        } catch (FileNotFoundException e3) {
            File parentFile = this.f38780a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f38780a, e3);
            }
            try {
                return new fk(this.f38780a);
            } catch (FileNotFoundException e7) {
                throw new IOException("Couldn't create " + this.f38780a, e7);
            }
        }
    }
}
