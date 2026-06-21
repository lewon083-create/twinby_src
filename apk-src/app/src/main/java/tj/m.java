package tj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class m extends l {
    public static void e(File file, File target, int i) {
        boolean z5 = (i & 2) == 0;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new o(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z5) {
                Intrinsics.checkNotNullParameter(file, "file");
                throw new b(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                Intrinsics.checkNotNullParameter(file, "file");
                throw new b(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new androidx.datastore.preferences.protobuf.m(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                hl.d.i(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean f(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.f27501c;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        g gVar = new g(new i(start, direction, null, null, null, 0, 32, null));
        while (true) {
            boolean z5 = true;
            while (gVar.hasNext()) {
                File file = (File) gVar.next();
                if (!file.delete() && file.exists()) {
                    z5 = false;
                } else {
                    if (z5) {
                        break;
                    }
                    z5 = false;
                }
            }
            return z5;
        }
    }
}
