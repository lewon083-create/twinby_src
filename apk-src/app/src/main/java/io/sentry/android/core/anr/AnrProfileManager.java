package io.sentry.android.core.anr;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.cache.tape.ObjectQueue;
import io.sentry.cache.tape.QueueFile;
import io.sentry.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AnrProfileManager implements AutoCloseable {
    private static final int MAX_NUM_STACKTRACES = 120;

    @NotNull
    private final ObjectQueue<AnrStackTrace> queue;

    public AnrProfileManager(@NotNull SentryOptions sentryOptions) {
        this(sentryOptions, new File((String) Objects.requireNonNull(sentryOptions.getCacheDirPath(), "cacheDirPath is required"), "anr_profile"));
    }

    public void add(AnrStackTrace anrStackTrace) {
        this.queue.add(anrStackTrace);
    }

    public void clear() {
        this.queue.clear();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.queue.close();
    }

    @NotNull
    public AnrProfile load() {
        return new AnrProfile(this.queue.asList());
    }

    public AnrProfileManager(@NotNull SentryOptions sentryOptions, @NotNull File file) {
        QueueFile queueFileBuild;
        ILogger logger = sentryOptions.getLogger();
        try {
            try {
                queueFileBuild = new QueueFile.Builder(file).size(120).build();
            } catch (IOException e3) {
                logger.log(SentryLevel.ERROR, "Failed to create stacktrace queue", e3);
                queueFileBuild = null;
            }
        } catch (IOException unused) {
            if (file.delete()) {
                queueFileBuild = new QueueFile.Builder(file).size(120).build();
            } else {
                throw new IOException("Could not delete file");
            }
        }
        if (queueFileBuild == null) {
            this.queue = ObjectQueue.createEmpty();
        } else {
            this.queue = ObjectQueue.create(queueFileBuild, new ObjectQueue.Converter<AnrStackTrace>() { // from class: io.sentry.android.core.anr.AnrProfileManager.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                public AnrStackTrace from(byte[] bArr) {
                    return AnrStackTrace.deserialize(new DataInputStream(new ByteArrayInputStream(bArr)));
                }

                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                public void toStream(@NotNull AnrStackTrace anrStackTrace, @NotNull OutputStream outputStream) throws IOException {
                    DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                    try {
                        anrStackTrace.serialize(dataOutputStream);
                        dataOutputStream.flush();
                        outputStream.flush();
                        dataOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            dataOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            });
        }
    }
}
