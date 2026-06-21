package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Lines {

    @NotNull
    private final ArrayList<? extends Line> mList;
    private final int mMax;
    private final int mMin = 0;
    public int pos;

    public Lines(@NotNull ArrayList<? extends Line> arrayList) {
        this.mList = arrayList;
        this.mMax = arrayList.size();
    }

    public static Lines readLines(@NotNull File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            Lines lines = readLines(bufferedReader);
            bufferedReader.close();
            return lines;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public boolean hasNext() {
        return this.pos < this.mMax;
    }

    @Nullable
    public Line next() {
        int i = this.pos;
        if (i < this.mMin || i >= this.mMax) {
            return null;
        }
        ArrayList<? extends Line> arrayList = this.mList;
        this.pos = i + 1;
        return arrayList.get(i);
    }

    public void rewind() {
        this.pos--;
    }

    public static Lines readLines(@NotNull BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                i++;
                arrayList.add(new Line(i, line));
            } else {
                return new Lines(arrayList);
            }
        }
    }
}
