package yads;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class to3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f43391a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f43392b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f43393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f43394d;

    static {
        HashMap map = new HashMap();
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "white");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "lime");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "cyan");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map, "red");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "yellow");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "magenta");
        pe.a.o(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "blue");
        pe.a.o(0, 0, 0, map, "black");
        f43393c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_white");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_lime");
        pe.a.o(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_cyan");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map2, "bg_red");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_yellow");
        pe.a.o(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_magenta");
        pe.a.o(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_blue");
        pe.a.o(0, 0, 0, map2, "bg_black");
        f43394d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.text.SpannableStringBuilder r18, yads.qo3 r19, java.lang.String r20, java.util.List r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.to3.a(android.text.SpannableStringBuilder, yads.qo3, java.lang.String, java.util.List, java.util.List):void");
    }

    public static void b(String str, so3 so3Var) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    kh1.d("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                    break;
            }
            so3Var.f43018g = i;
            str = str.substring(0, iIndexOf);
        }
        if (!str.endsWith("%")) {
            so3Var.f43016e = Integer.parseInt(str);
            so3Var.f43017f = 1;
            return;
        }
        int i10 = vo3.f44105a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        so3Var.f43016e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        so3Var.f43017f = 0;
    }

    public static oo3 a(String str, Matcher matcher, lb2 lb2Var, ArrayList arrayList) {
        so3 so3Var = new so3();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            so3Var.f43012a = vo3.a(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            so3Var.f43013b = vo3.a(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            a(strGroup3, so3Var);
            StringBuilder sb2 = new StringBuilder();
            String strC = lb2Var.c();
            while (!TextUtils.isEmpty(strC)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strC.trim());
                strC = lb2Var.c();
            }
            so3Var.f43014c = a(str, sb2.toString(), arrayList);
            return new oo3(so3Var.a().a(), so3Var.f43012a, so3Var.f43013b);
        } catch (NumberFormatException unused) {
            kh1.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static SpannedString a(String str, String str2, List list) {
        String str3;
        char c8;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i < str2.length()) {
                char cCharAt = str2.charAt(i);
                if (cCharAt == '&') {
                    i++;
                    int iIndexOf = str2.indexOf(59, i);
                    int iIndexOf2 = str2.indexOf(32, i);
                    if (iIndexOf == -1) {
                        iIndexOf = iIndexOf2;
                    } else if (iIndexOf2 != -1) {
                        iIndexOf = Math.min(iIndexOf, iIndexOf2);
                    }
                    if (iIndexOf != -1) {
                        strSubstring = str2.substring(i, iIndexOf);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "gt":
                                spannableStringBuilder.append('>');
                                break;
                            case "lt":
                                spannableStringBuilder.append('<');
                                break;
                            case "amp":
                                spannableStringBuilder.append('&');
                                break;
                            case "nbsp":
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                kh1.d("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                                break;
                        }
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i = iIndexOf + 1;
                    } else {
                        spannableStringBuilder.append(cCharAt);
                    }
                } else if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                    i++;
                } else {
                    int length = i + 1;
                    if (length < str2.length()) {
                        boolean z5 = str2.charAt(length) == '/';
                        int iIndexOf3 = str2.indexOf(62, length);
                        length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                        int i10 = length - 2;
                        boolean z10 = str2.charAt(i10) == '/';
                        int i11 = i + (z5 ? 2 : 1);
                        if (!z10) {
                            i10 = length - 1;
                        }
                        String strSubstring2 = str2.substring(i11, i10);
                        if (!strSubstring2.trim().isEmpty()) {
                            String strTrim2 = strSubstring2.trim();
                            if (!strTrim2.isEmpty()) {
                                int i12 = lb3.f40466a;
                                str3 = strTrim2.split("[ \\.]", 2)[0];
                                str3.getClass();
                                switch (str3) {
                                    case "b":
                                    case "c":
                                    case "i":
                                    case "u":
                                    case "v":
                                    case "rt":
                                    case "lang":
                                    case "ruby":
                                        if (!z5) {
                                            if (!z10) {
                                                int length2 = spannableStringBuilder.length();
                                                String strTrim3 = strSubstring2.trim();
                                                if (!strTrim3.isEmpty()) {
                                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                                    if (iIndexOf4 == -1) {
                                                        c8 = 0;
                                                    } else {
                                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                                        c8 = 0;
                                                        strTrim3 = strTrim3.substring(0, iIndexOf4);
                                                    }
                                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                                    String str4 = strArrSplit[c8];
                                                    HashSet hashSet = new HashSet();
                                                    for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                                                        hashSet.add(strArrSplit[i13]);
                                                    }
                                                    arrayDeque.push(new qo3(str4, length2, strTrim, hashSet));
                                                } else {
                                                    throw new IllegalArgumentException();
                                                }
                                            }
                                            break;
                                        } else {
                                            while (!arrayDeque.isEmpty()) {
                                                qo3 qo3Var = (qo3) arrayDeque.pop();
                                                a(spannableStringBuilder, qo3Var, str, arrayList, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new po3(qo3Var, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (qo3Var.f42359a.equals(str3)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    default:
                                        i = length;
                                        break;
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    i = length;
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(spannableStringBuilder, (qo3) arrayDeque.pop(), str, arrayList, list);
                }
                a(spannableStringBuilder, new qo3("", 0, "", Collections.EMPTY_SET), str, Collections.EMPTY_LIST, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(String str, so3 so3Var) {
        int i;
        int i10;
        int i11;
        Matcher matcher = f43392b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    b(strGroup2, so3Var);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i = 2;
                            break;
                        case "end":
                            i = 3;
                            break;
                        case "left":
                            i = 4;
                            break;
                        case "right":
                            i = 5;
                            break;
                        case "start":
                            i = 1;
                            break;
                        default:
                            kh1.d("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                            break;
                    }
                    so3Var.f43015d = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring.hashCode()) {
                            case -1842484672:
                                if (strSubstring.equals("line-left")) {
                                }
                                break;
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                }
                                break;
                            case -1276788989:
                                if (strSubstring.equals("line-right")) {
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                }
                                break;
                        }
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Switch insn not found in header
                            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            */
                        /*
                            Method dump skipped, instruction units count: 546
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: yads.to3.a(java.lang.String, yads.so3):void");
                    }
                }
