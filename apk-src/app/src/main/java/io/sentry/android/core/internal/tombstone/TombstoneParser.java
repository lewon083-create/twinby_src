package io.sentry.android.core.internal.tombstone;

import a8.a;
import a8.b;
import a8.c;
import a8.d;
import a8.e;
import a8.f;
import androidx.annotation.NonNull;
import g8.g;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryStackTraceFactory;
import io.sentry.android.core.internal.util.NativeEventUtils;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class TombstoneParser implements Closeable {
    private final Map<String, String> excTypeValueMap;

    @NotNull
    private final List<String> inAppExcludes;

    @NotNull
    private final List<String> inAppIncludes;

    @Nullable
    private final String nativeLibraryDir;

    @Nullable
    private final InputStream tombstoneStream;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class ModuleAccumulator {
        long beginAddress;
        String buildId;
        long endAddress;
        String mappingName;

        public ModuleAccumulator(b bVar) {
            this.mappingName = bVar.f513e;
            this.buildId = bVar.f514f;
            this.beginAddress = bVar.f509a;
            this.endAddress = bVar.f510b;
        }

        public void extendTo(long j10) {
            this.endAddress = j10;
        }

        public DebugImage toDebugImage() {
            if (this.buildId.isEmpty()) {
                return null;
            }
            DebugImage debugImage = new DebugImage();
            debugImage.setCodeId(this.buildId);
            debugImage.setCodeFile(this.mappingName);
            String strBuildIdToDebugId = NativeEventUtils.buildIdToDebugId(this.buildId);
            if (strBuildIdToDebugId == null) {
                strBuildIdToDebugId = this.buildId;
            }
            debugImage.setDebugId(strBuildIdToDebugId);
            debugImage.setImageAddr(TombstoneParser.formatHex(this.beginAddress));
            debugImage.setImageSize(this.endAddress - this.beginAddress);
            debugImage.setType("elf");
            return debugImage;
        }
    }

    public TombstoneParser(@NotNull List<String> list, @NotNull List<String> list2, @Nullable String str) {
        this(null, list, list2, str);
    }

    @NonNull
    private Message constructMessage(@NonNull e eVar) {
        Message message = new Message();
        d dVar = eVar.f524d;
        int i = eVar.f521a;
        List list = eVar.f523c;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " ");
            }
        }
        String string = sb2.toString();
        if (eVar.f524d == null) {
            Locale locale = Locale.ROOT;
            message.setFormatted("Fatal exit pid = " + i + " (" + string + ")");
            return message;
        }
        String str = eVar.f525e;
        Locale locale2 = Locale.ROOT;
        String strConcat = !str.isEmpty() ? str.concat(": ") : "";
        message.setFormatted(strConcat + "Fatal signal " + dVar.f518b + " (" + dVar.f517a + "), " + dVar.f520d + " (" + dVar.f519c + "), pid = " + i + " (" + string + ")");
        return message;
    }

    private DebugMeta createDebugMeta(@NonNull e eVar) {
        DebugImage debugImage;
        DebugImage debugImage2;
        ArrayList arrayList = new ArrayList();
        ModuleAccumulator moduleAccumulator = null;
        for (b bVar : eVar.f527g) {
            boolean z5 = bVar.f512d;
            long j10 = bVar.f510b;
            if (z5) {
                String str = bVar.f513e;
                if (!str.isEmpty() && !str.startsWith("/dev/")) {
                    boolean zIsEmpty = bVar.f514f.isEmpty();
                    boolean z10 = bVar.f511c == 0;
                    if (zIsEmpty || !z10) {
                        if (moduleAccumulator != null && str.equals(moduleAccumulator.mappingName)) {
                            moduleAccumulator.extendTo(j10);
                        }
                    } else if (moduleAccumulator == null || !str.equals(moduleAccumulator.mappingName)) {
                        if (moduleAccumulator != null && (debugImage2 = moduleAccumulator.toDebugImage()) != null) {
                            arrayList.add(debugImage2);
                        }
                        moduleAccumulator = new ModuleAccumulator(bVar);
                    } else {
                        moduleAccumulator.extendTo(j10);
                    }
                }
            }
        }
        if (moduleAccumulator != null && (debugImage = moduleAccumulator.toDebugImage()) != null) {
            arrayList.add(debugImage);
        }
        DebugMeta debugMeta = new DebugMeta();
        debugMeta.setImages(arrayList);
        return debugMeta;
    }

    @NonNull
    private List<SentryException> createException(@NonNull e eVar) {
        SentryException sentryException = new SentryException();
        d dVar = eVar.f524d;
        if (dVar != null) {
            sentryException.setType(dVar.f518b);
            sentryException.setValue(this.excTypeValueMap.get(dVar.f518b));
            sentryException.setMechanism(createMechanismFromSignalInfo(dVar));
        }
        sentryException.setThreadId(Long.valueOf(eVar.f522b));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sentryException);
        return arrayList;
    }

    @NonNull
    private static Mechanism createMechanismFromSignalInfo(@NonNull d dVar) {
        Mechanism mechanism = new Mechanism();
        mechanism.setType(NativeExceptionMechanism.TOMBSTONE.getValue());
        mechanism.setHandled(Boolean.FALSE);
        mechanism.setSynthetic(Boolean.TRUE);
        HashMap map = new HashMap();
        map.put("number", Integer.valueOf(dVar.f517a));
        map.put("name", dVar.f518b);
        map.put("code", Integer.valueOf(dVar.f519c));
        map.put("code_name", dVar.f520d);
        mechanism.setMeta(map);
        return mechanism;
    }

    @NonNull
    private SentryStackTrace createStackTrace(@NonNull f fVar) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : fVar.f531d) {
            String str = aVar.f508c;
            String str2 = aVar.f507b;
            String str3 = aVar.f508c;
            if (!str.endsWith("libart.so") && (!str3.startsWith("<anonymous") || !str2.isEmpty())) {
                SentryStackFrame sentryStackFrame = new SentryStackFrame();
                sentryStackFrame.setPackage(str3);
                sentryStackFrame.setFunction(str2);
                sentryStackFrame.setInstructionAddr(formatHex(aVar.f506a));
                Boolean boolIsInApp = str2.isEmpty() ? Boolean.FALSE : SentryStackTraceFactory.isInApp(str2, this.inAppIncludes, this.inAppExcludes);
                String str4 = this.nativeLibraryDir;
                boolean z5 = true;
                boolean z10 = str4 != null && str3.startsWith(str4);
                if ((boolIsInApp == null || !boolIsInApp.booleanValue()) && !z10) {
                    z5 = false;
                }
                sentryStackFrame.setInApp(Boolean.valueOf(z5));
                arrayList.add(0, sentryStackFrame);
            }
        }
        SentryStackTrace sentryStackTrace = new SentryStackTrace();
        sentryStackTrace.setFrames(arrayList);
        sentryStackTrace.setInstructionAddressAdjustment(SentryStackTrace.InstructionAddressAdjustment.NONE);
        HashMap map = new HashMap();
        for (c cVar : fVar.f530c) {
            map.put(cVar.f515a, formatHex(cVar.f516b));
        }
        sentryStackTrace.setRegisters(map);
        return sentryStackTrace;
    }

    @NonNull
    private List<SentryThread> createThreads(@NonNull e eVar, @NonNull SentryException sentryException) {
        ArrayList arrayList = new ArrayList();
        Iterator it = eVar.f526f.entrySet().iterator();
        while (it.hasNext()) {
            f fVar = (f) ((Map.Entry) it.next()).getValue();
            SentryThread sentryThread = new SentryThread();
            sentryThread.setId(Long.valueOf(((Integer) r2.getKey()).intValue()));
            sentryThread.setName(fVar.f529b);
            SentryStackTrace sentryStackTraceCreateStackTrace = createStackTrace(fVar);
            sentryThread.setStacktrace(sentryStackTraceCreateStackTrace);
            if (eVar.f522b == fVar.f528a) {
                sentryThread.setCrashed(Boolean.TRUE);
                sentryException.setStacktrace(sentryStackTraceCreateStackTrace);
            }
            arrayList.add(sentryThread);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatHex(long j10) {
        return String.format("0x%x", Long.valueOf(j10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.tombstoneStream;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0063. Please report as an issue. */
    @NonNull
    public SentryEvent parse() throws IOException {
        b8.a aVar;
        HashMap map;
        ArrayList arrayList;
        int iJ;
        boolean z5;
        b8.a aVar2;
        HashMap map2;
        ArrayList arrayList2;
        HashMap map3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        b8.a aVar3;
        b8.a aVar4;
        b8.a aVar5;
        InputStream inputStream = this.tombstoneStream;
        if (inputStream == null) {
            throw new IOException("No InputStream provided; use parse(Tombstone) instead.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        b8.a aVar6 = new b8.a(byteArrayOutputStream.toByteArray());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str = "";
        int i10 = 0;
        String strH = "";
        d dVar = null;
        int iJ2 = 0;
        while (true) {
            int i11 = aVar6.i();
            if (i11 == 0) {
                return parse(new e(iJ2, i10, arrayList5, dVar, strH, arrayList6, arrayList7, map4, map5, arrayList8, arrayList9, arrayList10));
            }
            int i12 = i11 >>> 3;
            String str2 = str;
            int i13 = i11 & 7;
            int i14 = iJ2;
            switch (i12) {
                case 1:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    z5 = false;
                    b8.a.d(i12, 0, i13);
                    int iJ3 = (int) aVar.j();
                    int[] iArrP = z.p(6);
                    int length = iArrP.length;
                    for (int i15 = 0; i15 < length && z.m(iArrP[i15]) != iJ3; i15++) {
                    }
                    iJ2 = i14;
                    break;
                case 2:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    aVar.h();
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 3:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    aVar.h();
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 4:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    aVar.h();
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 5:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 0, i13);
                    iJ2 = (int) aVar.j();
                    z5 = false;
                    break;
                case 6:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    z5 = false;
                    b8.a.d(i12, 0, i13);
                    iJ = (int) aVar.j();
                    iJ2 = i14;
                    break;
                case 7:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    z5 = false;
                    b8.a.d(i12, 0, i13);
                    aVar.j();
                    iJ2 = i14;
                    break;
                case 8:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    aVar.h();
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 9:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    arrayList5.add(aVar.h());
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 10:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    b8.a aVarG = aVar.g();
                    String strH2 = str2;
                    String strH3 = strH2;
                    int iJ4 = 0;
                    int iJ5 = 0;
                    while (true) {
                        int i16 = aVarG.i();
                        if (i16 == 0) {
                            dVar = new d(iJ4, iJ5, strH2, strH3);
                            iJ2 = i14;
                            z5 = false;
                            break;
                        } else {
                            int i17 = i16 >>> 3;
                            int i18 = i16 & 7;
                            switch (i17) {
                                case 1:
                                    b8.a.d(i17, 0, i18);
                                    iJ4 = (int) aVarG.j();
                                    break;
                                case 2:
                                    b8.a.d(i17, 2, i18);
                                    strH2 = aVarG.h();
                                    break;
                                case 3:
                                    b8.a.d(i17, 0, i18);
                                    iJ5 = (int) aVarG.j();
                                    break;
                                case 4:
                                    b8.a.d(i17, 2, i18);
                                    strH3 = aVarG.h();
                                    break;
                                case 5:
                                    b8.a.d(i17, 0, i18);
                                    aVarG.e();
                                    break;
                                case 6:
                                    b8.a.d(i17, 0, i18);
                                    aVarG.j();
                                    break;
                                case 7:
                                    b8.a.d(i17, 0, i18);
                                    aVarG.j();
                                    break;
                                case 8:
                                    b8.a.d(i17, 0, i18);
                                    aVarG.e();
                                    break;
                                case 9:
                                    b8.a.d(i17, 0, i18);
                                    aVarG.j();
                                    break;
                                case 10:
                                    b8.a.d(i17, 2, i18);
                                    wa.a.m(aVarG.g());
                                    break;
                                default:
                                    aVarG.k(i18);
                                    break;
                            }
                        }
                    }
                    break;
                case 11:
                case 12:
                case 13:
                default:
                    aVar6.k(i13);
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 14:
                    aVar = aVar6;
                    map = map5;
                    arrayList = arrayList8;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    strH = aVar.h();
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 15:
                    aVar = aVar6;
                    iJ = i10;
                    int i19 = 2;
                    b8.a.d(i12, 2, i13);
                    b8.a aVarG2 = aVar.g();
                    while (true) {
                        int i20 = aVarG2.i();
                        if (i20 == 0) {
                            map = map5;
                            arrayList = arrayList8;
                            arrayList7.add(new wd.d());
                            iJ2 = i14;
                            z5 = false;
                        } else {
                            int i21 = i20 >>> 3;
                            int i22 = i20 & 7;
                            if (i21 != 1) {
                                if (i21 != i19) {
                                    aVarG2.k(i22);
                                } else {
                                    b8.a.d(i21, i19, i22);
                                    b8.a aVarG3 = aVarG2.g();
                                    while (true) {
                                        int i23 = aVarG3.i();
                                        if (i23 != 0) {
                                            int i24 = i23 >>> 3;
                                            int i25 = i23 & 7;
                                            b8.a aVar7 = aVarG2;
                                            if (i24 == 1) {
                                                map3 = map5;
                                                arrayList3 = arrayList8;
                                                b8.a.d(i24, 0, i25);
                                                int iJ6 = (int) aVarG3.j();
                                                int[] iArrP2 = z.p(2);
                                                int length2 = iArrP2.length;
                                                for (int i26 = 0; i26 < length2 && z.m(iArrP2[i26]) != iJ6; i26++) {
                                                }
                                            } else if (i24 == i19) {
                                                map3 = map5;
                                                arrayList3 = arrayList8;
                                                b8.a.d(i24, 0, i25);
                                                int iJ7 = (int) aVarG3.j();
                                                int[] iArrP3 = z.p(6);
                                                int length3 = iArrP3.length;
                                                for (int i27 = 0; i27 < length3 && z.m(iArrP3[i27]) != iJ7; i27++) {
                                                }
                                            } else if (i24 != 3) {
                                                aVarG3.k(i25);
                                                map3 = map5;
                                                arrayList3 = arrayList8;
                                            } else {
                                                b8.a.d(i24, i19, i25);
                                                b8.a aVarG4 = aVarG3.g();
                                                ArrayList arrayList11 = new ArrayList();
                                                ArrayList arrayList12 = new ArrayList();
                                                while (true) {
                                                    int i28 = aVarG4.i();
                                                    if (i28 != 0) {
                                                        int i29 = i28 >>> 3;
                                                        HashMap map6 = map5;
                                                        int i30 = i28 & 7;
                                                        switch (i29) {
                                                            case 1:
                                                                arrayList4 = arrayList8;
                                                                b8.a.d(i29, 0, i30);
                                                                aVarG4.j();
                                                                break;
                                                            case 2:
                                                                arrayList4 = arrayList8;
                                                                b8.a.d(i29, 0, i30);
                                                                aVarG4.j();
                                                                break;
                                                            case 3:
                                                                arrayList4 = arrayList8;
                                                                b8.a.d(i29, 0, i30);
                                                                aVarG4.j();
                                                                break;
                                                            case 4:
                                                                arrayList4 = arrayList8;
                                                                b8.a.d(i29, 2, i30);
                                                                arrayList11.add(wa.a.l(aVarG4.g()));
                                                                break;
                                                            case 5:
                                                                arrayList4 = arrayList8;
                                                                b8.a.d(i29, 0, i30);
                                                                aVarG4.j();
                                                                break;
                                                            case 6:
                                                                arrayList4 = arrayList8;
                                                                b8.a.d(i29, 2, i30);
                                                                arrayList12.add(wa.a.l(aVarG4.g()));
                                                                break;
                                                            default:
                                                                aVarG4.k(i30);
                                                                arrayList4 = arrayList8;
                                                                break;
                                                        }
                                                        arrayList8 = arrayList4;
                                                        map5 = map6;
                                                    } else {
                                                        map3 = map5;
                                                        arrayList3 = arrayList8;
                                                        Collections.unmodifiableList(arrayList11);
                                                        Collections.unmodifiableList(arrayList12);
                                                    }
                                                }
                                            }
                                            arrayList8 = arrayList3;
                                            aVarG2 = aVar7;
                                            map5 = map3;
                                            i19 = 2;
                                        }
                                    }
                                }
                                aVar2 = aVarG2;
                                map2 = map5;
                                arrayList2 = arrayList8;
                            } else {
                                aVar2 = aVarG2;
                                map2 = map5;
                                arrayList2 = arrayList8;
                                b8.a.d(i21, i19, i22);
                                aVar2.h();
                            }
                            arrayList8 = arrayList2;
                            aVarG2 = aVar2;
                            map5 = map2;
                        }
                        break;
                    }
                    break;
                case 16:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    wa.a.n(aVar.g(), map4);
                    map = map5;
                    arrayList = arrayList8;
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 17:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    b8.a aVarG5 = aVar.g();
                    long j10 = 0;
                    long j11 = 0;
                    long j12 = 0;
                    String strH4 = str2;
                    String strH5 = strH4;
                    boolean zE = false;
                    while (true) {
                        int i31 = aVarG5.i();
                        if (i31 == 0) {
                            arrayList8.add(new b(j10, j11, j12, zE, strH4, strH5));
                            map = map5;
                            arrayList = arrayList8;
                            iJ2 = i14;
                            z5 = false;
                            break;
                        } else {
                            int i32 = i31 >>> 3;
                            int i33 = i31 & 7;
                            switch (i32) {
                                case 1:
                                    b8.a.d(i32, 0, i33);
                                    j10 = aVarG5.j();
                                    break;
                                case 2:
                                    b8.a.d(i32, 0, i33);
                                    j11 = aVarG5.j();
                                    break;
                                case 3:
                                    b8.a.d(i32, 0, i33);
                                    j12 = aVarG5.j();
                                    break;
                                case 4:
                                    b8.a.d(i32, 0, i33);
                                    zE = aVarG5.e();
                                    break;
                                case 5:
                                    b8.a.d(i32, 0, i33);
                                    aVarG5.e();
                                    break;
                                case 6:
                                    b8.a.d(i32, 0, i33);
                                    aVarG5.e();
                                    break;
                                case 7:
                                    b8.a.d(i32, 2, i33);
                                    strH4 = aVarG5.h();
                                    break;
                                case 8:
                                    b8.a.d(i32, 2, i33);
                                    strH5 = aVarG5.h();
                                    break;
                                case 9:
                                    b8.a.d(i32, 0, i33);
                                    aVarG5.j();
                                    break;
                                default:
                                    aVarG5.k(i33);
                                    break;
                            }
                        }
                    }
                    break;
                case 18:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    b8.a aVarG6 = aVar.g();
                    ArrayList arrayList13 = new ArrayList();
                    while (true) {
                        int i34 = aVarG6.i();
                        if (i34 == 0) {
                            wd.d dVar2 = new wd.d();
                            Collections.unmodifiableList(arrayList13);
                            arrayList9.add(dVar2);
                            map = map5;
                            arrayList = arrayList8;
                            iJ2 = i14;
                            z5 = false;
                        } else {
                            int i35 = i34 >>> 3;
                            int i36 = i34 & 7;
                            if (i35 == 1) {
                                aVar3 = aVarG6;
                                b8.a.d(i35, 2, i36);
                                aVar3.h();
                            } else if (i35 != 2) {
                                aVarG6.k(i36);
                                aVar3 = aVarG6;
                            } else {
                                b8.a.d(i35, 2, i36);
                                b8.a aVarG7 = aVarG6.g();
                                while (true) {
                                    int i37 = aVarG7.i();
                                    if (i37 != 0) {
                                        int i38 = i37 >>> 3;
                                        int i39 = i37 & 7;
                                        switch (i38) {
                                            case 1:
                                                aVar4 = aVarG6;
                                                b8.a.d(i38, 2, i39);
                                                aVarG7.h();
                                                break;
                                            case 2:
                                                aVar4 = aVarG6;
                                                b8.a.d(i38, 0, i39);
                                                aVarG7.j();
                                                break;
                                            case 3:
                                                aVar4 = aVarG6;
                                                b8.a.d(i38, 0, i39);
                                                aVarG7.j();
                                                break;
                                            case 4:
                                                aVar4 = aVarG6;
                                                b8.a.d(i38, 0, i39);
                                                aVarG7.j();
                                                break;
                                            case 5:
                                                aVar4 = aVarG6;
                                                b8.a.d(i38, 2, i39);
                                                aVarG7.h();
                                                break;
                                            case 6:
                                                aVar4 = aVarG6;
                                                b8.a.d(i38, 2, i39);
                                                aVarG7.h();
                                                break;
                                            default:
                                                aVarG7.k(i39);
                                                aVar4 = aVarG6;
                                                break;
                                        }
                                        aVarG6 = aVar4;
                                    } else {
                                        aVar3 = aVarG6;
                                        arrayList13.add(new g(3));
                                    }
                                }
                            }
                            aVarG6 = aVar3;
                        }
                        break;
                    }
                    break;
                case 19:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    b8.a aVarG8 = aVar.g();
                    while (true) {
                        int i40 = aVarG8.i();
                        if (i40 == 0) {
                            arrayList10.add(new nc.e());
                            map = map5;
                            arrayList = arrayList8;
                            iJ2 = i14;
                            z5 = false;
                            break;
                        } else {
                            int i41 = i40 >>> 3;
                            int i42 = i40 & 7;
                            if (i41 == 1) {
                                b8.a.d(i41, 0, i42);
                                aVarG8.j();
                            } else if (i41 == 2) {
                                b8.a.d(i41, 2, i42);
                                aVarG8.h();
                            } else if (i41 == 3) {
                                b8.a.d(i41, 2, i42);
                                aVarG8.h();
                            } else if (i41 != 4) {
                                aVarG8.k(i42);
                            } else {
                                b8.a.d(i41, 0, i42);
                                aVarG8.j();
                            }
                        }
                    }
                    break;
                case 20:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 0, i13);
                    aVar.j();
                    map = map5;
                    arrayList = arrayList8;
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 21:
                    aVar = aVar6;
                    iJ = i10;
                    int i43 = 2;
                    b8.a.d(i12, 2, i13);
                    b8.a aVarG9 = aVar.g();
                    while (true) {
                        int i44 = aVarG9.i();
                        if (i44 == 0) {
                            arrayList6.add(new g(2));
                            map = map5;
                            arrayList = arrayList8;
                            iJ2 = i14;
                            z5 = false;
                        } else {
                            int i45 = i44 >>> 3;
                            int i46 = i44 & 7;
                            if (i45 == 1) {
                                b8.a.d(i45, i43, i46);
                                aVarG9.f();
                            } else if (i45 != i43) {
                                aVarG9.k(i46);
                            } else {
                                b8.a.d(i45, i43, i46);
                                aVarG9.f();
                            }
                            i43 = 2;
                        }
                        break;
                    }
                    break;
                case 22:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 0, i13);
                    aVar.j();
                    map = map5;
                    arrayList = arrayList8;
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 23:
                    aVar = aVar6;
                    iJ = i10;
                    z5 = false;
                    b8.a.d(i12, 0, i13);
                    aVar.e();
                    map = map5;
                    arrayList = arrayList8;
                    iJ2 = i14;
                    break;
                case 24:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 0, i13);
                    int iJ8 = (int) aVar.j();
                    int[] iArrP4 = z.p(6);
                    int length4 = iArrP4.length;
                    for (int i47 = 0; i47 < length4 && z.m(iArrP4[i47]) != iJ8; i47++) {
                    }
                    map = map5;
                    arrayList = arrayList8;
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 25:
                    aVar = aVar6;
                    iJ = i10;
                    b8.a.d(i12, 2, i13);
                    wa.a.n(aVar.g(), map5);
                    map = map5;
                    arrayList = arrayList8;
                    iJ2 = i14;
                    z5 = false;
                    break;
                case 26:
                    b8.a.d(i12, 2, i13);
                    b8.a aVarG10 = aVar6.g();
                    ArrayList arrayList14 = new ArrayList();
                    while (true) {
                        int i48 = aVarG10.i();
                        if (i48 == 0) {
                            aVar = aVar6;
                            iJ = i10;
                            z5 = false;
                            Collections.unmodifiableList(arrayList14);
                            map = map5;
                            arrayList = arrayList8;
                            iJ2 = i14;
                        } else {
                            b8.a aVar8 = aVar6;
                            int i49 = i48 >>> 3;
                            int i50 = i48 & 7;
                            int i51 = i10;
                            if (i49 == 1) {
                                aVar5 = aVarG10;
                                b8.a.d(i49, 0, i50);
                                aVar5.j();
                            } else if (i49 != 2) {
                                aVarG10.k(i50);
                                aVar5 = aVarG10;
                            } else {
                                b8.a.d(i49, 2, i50);
                                b8.a aVarG11 = aVarG10.g();
                                while (true) {
                                    int i52 = aVarG11.i();
                                    if (i52 != 0) {
                                        int i53 = i52 >>> 3;
                                        int i54 = i52 & 7;
                                        b8.a aVar9 = aVarG10;
                                        if (i53 == 1) {
                                            b8.a.d(i53, 2, i54);
                                            wa.a.l(aVarG11.g());
                                        } else if (i53 == 2) {
                                            b8.a.d(i53, 0, i54);
                                            aVarG11.j();
                                        } else if (i53 != 3) {
                                            aVarG11.k(i54);
                                        } else {
                                            b8.a.d(i53, 0, i54);
                                            aVarG11.j();
                                        }
                                        aVarG10 = aVar9;
                                    } else {
                                        aVar5 = aVarG10;
                                        arrayList14.add(new wd.d());
                                    }
                                }
                            }
                            aVarG10 = aVar5;
                            aVar6 = aVar8;
                            i10 = i51;
                        }
                        break;
                    }
                    break;
            }
            str = str2;
            arrayList8 = arrayList;
            aVar6 = aVar;
            i10 = iJ;
            map5 = map;
        }
    }

    public TombstoneParser(@Nullable InputStream inputStream, @NotNull List<String> list, @NotNull List<String> list2, @Nullable String str) {
        HashMap map = new HashMap();
        this.excTypeValueMap = map;
        this.tombstoneStream = inputStream;
        this.inAppIncludes = list;
        this.inAppExcludes = list2;
        this.nativeLibraryDir = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    @NonNull
    public SentryEvent parse(@NonNull e eVar) {
        SentryEvent sentryEvent = new SentryEvent();
        sentryEvent.setLevel(SentryLevel.FATAL);
        sentryEvent.setPlatform("native");
        sentryEvent.setMessage(constructMessage(eVar));
        sentryEvent.setDebugMeta(createDebugMeta(eVar));
        sentryEvent.setExceptions(createException(eVar));
        List<SentryException> exceptions = sentryEvent.getExceptions();
        Objects.requireNonNull(exceptions);
        sentryEvent.setThreads(createThreads(eVar, exceptions.get(0)));
        return sentryEvent;
    }
}
