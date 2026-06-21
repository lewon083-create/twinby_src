package io.sentry.android.core.anr;

import io.sentry.util.StringUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnrStackTrace implements Comparable<AnrStackTrace> {
    private static final int MAX_STACK_LENGTH = 1000;
    public final StackTraceElement[] stack;
    public final long timestampMs;

    public AnrStackTrace(long j10, StackTraceElement[] stackTraceElementArr) {
        this.timestampMs = j10;
        this.stack = stackTraceElementArr;
    }

    @Nullable
    public static AnrStackTrace deserialize(@NotNull DataInputStream dataInputStream) throws IOException {
        try {
            if (dataInputStream.readShort() == 1) {
                long j10 = dataInputStream.readLong();
                int i = dataInputStream.readInt();
                if (i >= 0 && i <= 1000) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
                    for (int i10 = 0; i10 < i; i10++) {
                        String utf = dataInputStream.readUTF();
                        String utf2 = dataInputStream.readUTF();
                        boolean z5 = dataInputStream.readBoolean();
                        String utf3 = dataInputStream.readUTF();
                        if (z5) {
                            utf3 = null;
                        }
                        stackTraceElementArr[i10] = new StackTraceElement(utf, utf2, utf3, dataInputStream.readInt());
                    }
                    return new AnrStackTrace(j10, stackTraceElementArr);
                }
            }
        } catch (EOFException unused) {
        }
        return null;
    }

    public void serialize(@NotNull DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(1);
        dataOutputStream.writeLong(this.timestampMs);
        dataOutputStream.writeInt(this.stack.length);
        for (StackTraceElement stackTraceElement : this.stack) {
            dataOutputStream.writeUTF(StringUtils.getOrEmpty(stackTraceElement.getClassName()));
            dataOutputStream.writeUTF(StringUtils.getOrEmpty(stackTraceElement.getMethodName()));
            String fileName = stackTraceElement.getFileName();
            dataOutputStream.writeBoolean(fileName == null);
            if (fileName == null) {
                fileName = "";
            }
            dataOutputStream.writeUTF(fileName);
            dataOutputStream.writeInt(stackTraceElement.getLineNumber());
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull AnrStackTrace anrStackTrace) {
        return Long.compare(this.timestampMs, anrStackTrace.timestampMs);
    }
}
