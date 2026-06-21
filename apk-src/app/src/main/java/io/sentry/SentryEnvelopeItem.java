package io.sentry;

import io.sentry.clientreport.ClientReport;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.FileUtils;
import io.sentry.util.JsonSerializationUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryEnvelopeItem {
    private static final long MAX_PROFILE_CHUNK_SIZE = 52428800;
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    @Nullable
    private byte[] data;

    @Nullable
    private final Callable<byte[]> dataFactory;
    private final SentryEnvelopeItemHeader header;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class CachedItem {

        @Nullable
        private byte[] bytes;

        @Nullable
        private final Callable<byte[]> dataFactory;

        public CachedItem(@Nullable Callable<byte[]> callable) {
            this.dataFactory = callable;
        }

        @NotNull
        private static byte[] orEmptyArray(@Nullable byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        @NotNull
        public byte[] getBytes() {
            Callable<byte[]> callable;
            if (this.bytes == null && (callable = this.dataFactory) != null) {
                this.bytes = callable.call();
            }
            return orEmptyArray(this.bytes);
        }
    }

    public SentryEnvelopeItem(@NotNull SentryEnvelopeItemHeader sentryEnvelopeItemHeader, byte[] bArr) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.data = bArr;
        this.dataFactory = null;
    }

    private static void ensureAttachmentSizeLimit(long j10, long j11, @NotNull String str) throws SentryEnvelopeException {
        if (j10 > j11) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static SentryEnvelopeItem fromAttachment(@NotNull ISerializer iSerializer, @NotNull ILogger iLogger, @NotNull Attachment attachment, long j10) {
        CachedItem cachedItem = new CachedItem(new q(attachment, j10, iSerializer, iLogger));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Attachment, new p(20, cachedItem), attachment.getContentType(), attachment.getFilename(), attachment.getAttachmentType()), new p(21, cachedItem));
    }

    public static SentryEnvelopeItem fromCheckIn(@NotNull ISerializer iSerializer, @NotNull CheckIn checkIn) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(checkIn, "CheckIn is required.");
        CachedItem cachedItem = new CachedItem(new r(4, iSerializer, checkIn));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.CheckIn, new p(13, cachedItem), "application/json", null), new p(14, cachedItem));
    }

    @NotNull
    public static SentryEnvelopeItem fromClientReport(@NotNull ISerializer iSerializer, @NotNull ClientReport clientReport) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(clientReport, "ClientReport is required.");
        CachedItem cachedItem = new CachedItem(new r(3, iSerializer, clientReport));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(clientReport), new p(11, cachedItem), "application/json", null), new p(12, cachedItem));
    }

    @NotNull
    public static SentryEnvelopeItem fromEvent(@NotNull ISerializer iSerializer, @NotNull SentryBaseEvent sentryBaseEvent) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryBaseEvent, "SentryEvent is required.");
        CachedItem cachedItem = new CachedItem(new r(1, iSerializer, sentryBaseEvent));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.resolve(sentryBaseEvent), new p(6, cachedItem), "application/json", null), new p(8, cachedItem));
    }

    public static SentryEnvelopeItem fromLogs(@NotNull ISerializer iSerializer, @NotNull SentryLogEvents sentryLogEvents) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryLogEvents, "SentryLogEvents is required.");
        CachedItem cachedItem = new CachedItem(new r(5, iSerializer, sentryLogEvents));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Log, new p(16, cachedItem), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(sentryLogEvents.getItems().size())), new p(17, cachedItem));
    }

    public static SentryEnvelopeItem fromMetrics(@NotNull ISerializer iSerializer, @NotNull SentryMetricsEvents sentryMetricsEvents) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(sentryMetricsEvents, "SentryMetricsEvents is required.");
        CachedItem cachedItem = new CachedItem(new r(6, iSerializer, sentryMetricsEvents));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.TraceMetric, new p(18, cachedItem), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(sentryMetricsEvents.getItems().size())), new p(19, cachedItem));
    }

    @NotNull
    public static SentryEnvelopeItem fromProfileChunk(@NotNull ProfileChunk profileChunk, @NotNull ISerializer iSerializer) {
        return fromProfileChunk(profileChunk, iSerializer, NoOpProfileConverter.getInstance());
    }

    @NotNull
    public static SentryEnvelopeItem fromProfilingTrace(@NotNull ProfilingTraceData profilingTraceData, long j10, @NotNull ISerializer iSerializer) {
        File traceFile = profilingTraceData.getTraceFile();
        CachedItem cachedItem = new CachedItem(new q(traceFile, j10, profilingTraceData, iSerializer));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Profile, new p(2, cachedItem), "application-json", traceFile.getName()), new p(3, cachedItem));
    }

    public static SentryEnvelopeItem fromReplay(@NotNull final ISerializer iSerializer, @NotNull final ILogger iLogger, @NotNull final SentryReplayEvent sentryReplayEvent, @Nullable final ReplayRecording replayRecording, final boolean z5) {
        final File videoFile = sentryReplayEvent.getVideoFile();
        CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.lambda$fromReplay$24(iSerializer, sentryReplayEvent, replayRecording, videoFile, iLogger, z5);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.ReplayVideo, new p(7, cachedItem), null, null), new p(15, cachedItem));
    }

    @NotNull
    public static SentryEnvelopeItem fromSession(@NotNull ISerializer iSerializer, @NotNull Session session) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(session, "Session is required.");
        CachedItem cachedItem = new CachedItem(new r(0, iSerializer, session));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.Session, new p(4, cachedItem), "application/json", null), new p(5, cachedItem));
    }

    @Deprecated
    public static SentryEnvelopeItem fromUserFeedback(@NotNull ISerializer iSerializer, @NotNull UserFeedback userFeedback) {
        Objects.requireNonNull(iSerializer, "ISerializer is required.");
        Objects.requireNonNull(userFeedback, "UserFeedback is required.");
        CachedItem cachedItem = new CachedItem(new r(2, iSerializer, userFeedback));
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.UserFeedback, new p(9, cachedItem), "application/json", null), new p(10, cachedItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromAttachment$12(Attachment attachment, long j10, ISerializer iSerializer, ILogger iLogger) throws SentryEnvelopeException {
        byte[] bArrCall;
        if (attachment.getBytes() != null) {
            byte[] bytes = attachment.getBytes();
            ensureAttachmentSizeLimit(bytes.length, j10, attachment.getFilename());
            return bytes;
        }
        if (attachment.getSerializable() != null) {
            byte[] bArrBytesFrom = JsonSerializationUtils.bytesFrom(iSerializer, iLogger, attachment.getSerializable());
            if (bArrBytesFrom != null) {
                ensureAttachmentSizeLimit(bArrBytesFrom.length, j10, attachment.getFilename());
                return bArrBytesFrom;
            }
        } else {
            if (attachment.getPathname() != null) {
                return FileUtils.readBytesFromFile(attachment.getPathname(), j10);
            }
            if (attachment.getByteProvider() != null && (bArrCall = attachment.getByteProvider().call()) != null) {
                ensureAttachmentSizeLimit(bArrCall.length, j10, attachment.getFilename());
                return bArrCall;
            }
        }
        throw new SentryEnvelopeException(pe.a.f("Couldn't attach the attachment ", attachment.getFilename(), ".\nPlease check that either bytes, serializable, path or provider is set."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromAttachment$13(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromCheckIn$10(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromCheckIn$9(ISerializer iSerializer, CheckIn checkIn) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(checkIn, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromClientReport$21(ISerializer iSerializer, ClientReport clientReport) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(clientReport, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromClientReport$22(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromEvent$3(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryBaseEvent, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromEvent$4(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromLogs$27(ISerializer iSerializer, SentryLogEvents sentryLogEvents) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryLogEvents, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromLogs$28(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromMetrics$30(ISerializer iSerializer, SentryMetricsEvents sentryMetricsEvents) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(sentryMetricsEvents, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromMetrics$31(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromProfileChunk$15(File file, ProfileChunk profileChunk, IProfileConverter iProfileConverter, ISerializer iSerializer) throws SentryEnvelopeException {
        if (file != null) {
            if (!file.exists()) {
                throw new SentryEnvelopeException(pe.a.f("Dropping profile chunk, because the file '", file.getName(), "' doesn't exists"));
            }
            if (!"java".equals(profileChunk.getPlatform())) {
                String strEncodeToString = Base64.encodeToString(FileUtils.readBytesFromFile(file.getPath(), MAX_PROFILE_CHUNK_SIZE), 3);
                if (strEncodeToString.isEmpty()) {
                    throw new SentryEnvelopeException("Profiling trace file is empty");
                }
                profileChunk.setSampledProfile(strEncodeToString);
            } else {
                if (NoOpProfileConverter.getInstance().equals(iProfileConverter)) {
                    throw new SentryEnvelopeException("No ProfileConverter available, dropping chunk.");
                }
                try {
                    profileChunk.setSentryProfile(iProfileConverter.convertFromFile(file.getAbsolutePath()));
                } catch (Exception e3) {
                    throw new SentryEnvelopeException("Profile conversion failed", e3);
                }
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profileChunk, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } finally {
                if (file != null) {
                    file.delete();
                }
            }
        } catch (IOException e7) {
            throw new SentryEnvelopeException("Failed to serialize profile chunk\n" + e7.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromProfileChunk$16(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromProfilingTrace$18(File file, long j10, ProfilingTraceData profilingTraceData, ISerializer iSerializer) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(pe.a.f("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
        }
        String strEncodeToString = Base64.encodeToString(FileUtils.readBytesFromFile(file.getPath(), j10), 3);
        if (strEncodeToString.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        profilingTraceData.setSampledProfile(strEncodeToString);
        profilingTraceData.readDeviceCpuFrequencies();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                    try {
                        iSerializer.serialize(profilingTraceData, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e3) {
                throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e3.getMessage());
            }
        } finally {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromProfilingTrace$19(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromReplay$24(ISerializer iSerializer, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, File file, ILogger iLogger, boolean z5) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    iSerializer.serialize(sentryReplayEvent, bufferedWriter);
                    linkedHashMap.put(SentryItemType.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (replayRecording != null) {
                        iSerializer.serialize(replayRecording, bufferedWriter);
                        linkedHashMap.put(SentryItemType.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bytesFromFile = FileUtils.readBytesFromFile(file.getPath(), SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE);
                        if (bytesFromFile.length > 0) {
                            linkedHashMap.put(SentryItemType.ReplayVideo.getItemType(), bytesFromFile);
                        }
                    }
                    byte[] bArrSerializeToMsgpack = serializeToMsgpack(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z5) {
                            return bArrSerializeToMsgpack;
                        }
                    }
                    return bArrSerializeToMsgpack;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                iLogger.log(SentryLevel.ERROR, "Could not serialize replay recording", th2);
                if (file == null) {
                    return null;
                }
                if (z5) {
                    FileUtils.deleteRecursively(file.getParentFile());
                    return null;
                }
                file.delete();
                return null;
            } finally {
                if (file != null) {
                    if (z5) {
                        FileUtils.deleteRecursively(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromReplay$25(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromSession$0(ISerializer iSerializer, Session session) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(session, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromSession$1(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$fromUserFeedback$6(ISerializer iSerializer, UserFeedback userFeedback) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
            try {
                iSerializer.serialize(userFeedback, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$fromUserFeedback$7(CachedItem cachedItem) {
        return Integer.valueOf(cachedItem.getBytes().length);
    }

    private static byte[] serializeToMsgpack(@NotNull Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(UTF_8);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Nullable
    public ClientReport getClientReport(@NotNull ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            ClientReport clientReport = (ClientReport) iSerializer.deserialize(bufferedReader, ClientReport.class);
            bufferedReader.close();
            return clientReport;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public byte[] getData() {
        Callable<byte[]> callable;
        if (this.data == null && (callable = this.dataFactory) != null) {
            this.data = callable.call();
        }
        return this.data;
    }

    @Nullable
    public SentryEvent getEvent(@NotNull ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryEvent sentryEvent = (SentryEvent) iSerializer.deserialize(bufferedReader, SentryEvent.class);
            bufferedReader.close();
            return sentryEvent;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public SentryEnvelopeItemHeader getHeader() {
        return this.header;
    }

    @Nullable
    public SentryLogEvents getLogs(@NotNull ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryLogEvents sentryLogEvents = (SentryLogEvents) iSerializer.deserialize(bufferedReader, SentryLogEvents.class);
            bufferedReader.close();
            return sentryLogEvents;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Nullable
    public SentryMetricsEvents getMetrics(@NotNull ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryMetricsEvents sentryMetricsEvents = (SentryMetricsEvents) iSerializer.deserialize(bufferedReader, SentryMetricsEvents.class);
            bufferedReader.close();
            return sentryMetricsEvents;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Nullable
    public SentryTransaction getTransaction(@NotNull ISerializer iSerializer) throws IOException {
        SentryEnvelopeItemHeader sentryEnvelopeItemHeader = this.header;
        if (sentryEnvelopeItemHeader == null || sentryEnvelopeItemHeader.getType() != SentryItemType.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(getData()), UTF_8));
        try {
            SentryTransaction sentryTransaction = (SentryTransaction) iSerializer.deserialize(bufferedReader, SentryTransaction.class);
            bufferedReader.close();
            return sentryTransaction;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public static SentryEnvelopeItem fromProfileChunk(@NotNull final ProfileChunk profileChunk, @NotNull final ISerializer iSerializer, @NotNull final IProfileConverter iProfileConverter) {
        final File traceFile = profileChunk.getTraceFile();
        CachedItem cachedItem = new CachedItem(new Callable() { // from class: io.sentry.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SentryEnvelopeItem.lambda$fromProfileChunk$15(traceFile, profileChunk, iProfileConverter, iSerializer);
            }
        });
        return new SentryEnvelopeItem(new SentryEnvelopeItemHeader(SentryItemType.ProfileChunk, new p(0, cachedItem), "application-json", traceFile != null ? traceFile.getName() : null, (String) null, profileChunk.getPlatform(), (Integer) null), new p(1, cachedItem));
    }

    public SentryEnvelopeItem(@NotNull SentryEnvelopeItemHeader sentryEnvelopeItemHeader, @Nullable Callable<byte[]> callable) {
        this.header = (SentryEnvelopeItemHeader) Objects.requireNonNull(sentryEnvelopeItemHeader, "SentryEnvelopeItemHeader is required.");
        this.dataFactory = (Callable) Objects.requireNonNull(callable, "DataFactory is required.");
        this.data = null;
    }
}
