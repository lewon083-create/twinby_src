package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d2 implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sy f17049b;

    public /* synthetic */ d2(sy syVar, int i) {
        this.f17048a = i;
        this.f17049b = syVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object a(ParsingContext parsingContext, Object obj) {
        Object m7Var;
        Object objA;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        o7 o7Var = entityTemplate instanceof o7 ? (o7) entityTemplate : null;
        if (o7Var != null) {
            if (o7Var instanceof m7) {
                string = "set";
            } else if (o7Var instanceof k7) {
                string = "fade";
            } else if (o7Var instanceof l7) {
                string = "scale";
            } else {
                if (!(o7Var instanceof n7)) {
                    throw new ij.j();
                }
                string = "slide";
            }
        }
        int iHashCode = string.hashCode();
        sy syVar = this.f17049b;
        switch (iHashCode) {
            case 113762:
                if (string.equals("set")) {
                    m7Var = new m7(((f7) syVar.f18573x1.getValue()).deserialize(parsingContext, (h7) (o7Var != null ? o7Var.a() : null), jSONObject));
                    return m7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 3135100:
                if (string.equals("fade")) {
                    ac acVar = (ac) syVar.e3.getValue();
                    objA = o7Var != null ? o7Var.a() : null;
                    acVar.getClass();
                    m7Var = new k7(ac.a(parsingContext, (dc) objA, jSONObject));
                    return m7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 109250890:
                if (string.equals("scale")) {
                    cn cnVar = (cn) syVar.f18538t6.getValue();
                    objA = o7Var != null ? o7Var.a() : null;
                    cnVar.getClass();
                    m7Var = new l7(cn.a(parsingContext, (fn) objA, jSONObject));
                    return m7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 109526449:
                if (string.equals("slide")) {
                    m7Var = new n7(((yo) syVar.X6.getValue()).deserialize(parsingContext, (bp) (o7Var != null ? o7Var.a() : null), jSONObject));
                    return m7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object b(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int iHashCode = string.hashCode();
        sy syVar = this.f17049b;
        switch (iHashCode) {
            case -30518633:
                if (string.equals("nine_patch_image")) {
                    ((ni) syVar.Y4.getValue()).deserialize(parsingContext, jSONObject);
                    return new r7();
                }
                break;
            case 89650992:
                if (string.equals("gradient")) {
                    ((zh) syVar.M4.getValue()).deserialize(parsingContext, jSONObject);
                    return new r7();
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    ((pe) syVar.T3.getValue()).deserialize(parsingContext, jSONObject);
                    return new r7();
                }
                break;
            case 109618859:
                if (string.equals("solid")) {
                    ((op) syVar.f18427i7.getValue()).getClass();
                    op.a(parsingContext, jSONObject);
                    return new r7();
                }
                break;
            case 1881846096:
                if (string.equals("radial_gradient")) {
                    ((zl) syVar.f18437j6.getValue()).deserialize(parsingContext, jSONObject);
                    return new r7();
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        y7 y7Var = orThrow instanceof y7 ? (y7) orThrow : null;
        if (y7Var != null) {
            return ((s7) syVar.H1.getValue()).resolve(parsingContext, y7Var, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object c(ParsingContext parsingContext, Object obj) {
        Object v7Var;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        y7 y7Var = entityTemplate instanceof y7 ? (y7) entityTemplate : null;
        if (y7Var != null) {
            if (y7Var instanceof u7) {
                string = "gradient";
            } else if (y7Var instanceof w7) {
                string = "radial_gradient";
            } else if (y7Var instanceof t7) {
                string = "image";
            } else if (y7Var instanceof x7) {
                string = "solid";
            } else {
                if (!(y7Var instanceof v7)) {
                    throw new ij.j();
                }
                string = "nine_patch_image";
            }
        }
        int iHashCode = string.hashCode();
        sy syVar = this.f17049b;
        switch (iHashCode) {
            case -30518633:
                if (string.equals("nine_patch_image")) {
                    v7Var = new v7(((oi) syVar.Z4.getValue()).deserialize(parsingContext, (qi) (y7Var != null ? y7Var.a() : null), jSONObject));
                    return v7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 89650992:
                if (string.equals("gradient")) {
                    v7Var = new u7(((ai) syVar.N4.getValue()).deserialize(parsingContext, (ei) (y7Var != null ? y7Var.a() : null), jSONObject));
                    return v7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 100313435:
                if (string.equals("image")) {
                    v7Var = new t7(((qe) syVar.U3.getValue()).deserialize(parsingContext, (te) (y7Var != null ? y7Var.a() : null), jSONObject));
                    return v7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 109618859:
                if (string.equals("solid")) {
                    pp ppVar = (pp) syVar.f18438j7.getValue();
                    Object objA = y7Var != null ? y7Var.a() : null;
                    ppVar.getClass();
                    v7Var = new x7(pp.a(parsingContext, (rp) objA, jSONObject));
                    return v7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            case 1881846096:
                if (string.equals("radial_gradient")) {
                    v7Var = new w7(((am) syVar.f18448k6.getValue()).deserialize(parsingContext, (tm) (y7Var != null ? y7Var.a() : null), jSONObject));
                    return v7Var;
                }
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            default:
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
        }
    }

    private final Object d(ParsingContext parsingContext, Object obj) {
        Object t8Var;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        Object obj4 = null;
        v8 v8Var = entityTemplate instanceof v8 ? (v8) entityTemplate : null;
        if (v8Var != null) {
            if (v8Var instanceof u8) {
                string = "set";
            } else {
                if (!(v8Var instanceof t8)) {
                    throw new ij.j();
                }
                string = "change_bounds";
            }
        }
        boolean zA = Intrinsics.a(string, "set");
        sy syVar = this.f17049b;
        if (zA) {
            o8 o8Var = (o8) syVar.S1.getValue();
            if (v8Var != null) {
                if (v8Var instanceof u8) {
                    obj3 = ((u8) v8Var).f18675a;
                } else {
                    if (!(v8Var instanceof t8)) {
                        throw new ij.j();
                    }
                    obj3 = ((t8) v8Var).f18625a;
                }
                obj4 = obj3;
            }
            t8Var = new u8(o8Var.deserialize(parsingContext, (q8) obj4, jSONObject));
        } else {
            if (!Intrinsics.a(string, "change_bounds")) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
            }
            j8 j8Var = (j8) syVar.P1.getValue();
            if (v8Var != null) {
                if (v8Var instanceof u8) {
                    obj2 = ((u8) v8Var).f18675a;
                } else {
                    if (!(v8Var instanceof t8)) {
                        throw new ij.j();
                    }
                    obj2 = ((t8) v8Var).f18625a;
                }
                obj4 = obj2;
            }
            j8Var.getClass();
            t8Var = new t8(j8.a(parsingContext, (m8) obj4, jSONObject));
        }
        return t8Var;
    }

    private final Object e(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        JsonExpressionParser.readExpression(parsingContext, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
        JsonPropertyParser.readList(parsingContext, jSONObject, "prototypes", this.f17049b.f18400g2, j6.f17466g);
        return new h9();
    }

    private final Object f(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, i9.f17383a);
        return new g9();
    }

    private final Object g(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        sy syVar = this.f17049b;
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_end", typeHelper, function1, ba.f16908a);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_start", typeHelper, function1, ba.f16909b);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_between", typeHelper, function1, ba.f16910c);
        return new u9();
    }

    private final Object h(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean zA = Intrinsics.a(string, "infinity");
        sy syVar = this.f17049b;
        if (zA) {
            ((pf) syVar.f18391f4.getValue()).getClass();
            return new ia();
        }
        if (Intrinsics.a(string, "fixed")) {
            ((oc) syVar.f18466m3.getValue()).getClass();
            oc.a(parsingContext, jSONObject);
            return new ia();
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        ma maVar = orThrow instanceof ma ? (ma) orThrow : null;
        if (maVar != null) {
            return ((ja) syVar.f18574x2.getValue()).resolve(parsingContext, maVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    private final Object i(ParsingContext parsingContext, Object obj) {
        Object obj2;
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        Object obj4 = null;
        ma maVar = entityTemplate instanceof ma ? (ma) entityTemplate : null;
        if (maVar != null) {
            if (maVar instanceof la) {
                string = "infinity";
            } else {
                if (!(maVar instanceof ka)) {
                    throw new ij.j();
                }
                string = "fixed";
            }
        }
        boolean zA = Intrinsics.a(string, "infinity");
        sy syVar = this.f17049b;
        if (zA) {
            qf qfVar = (qf) syVar.f18402g4.getValue();
            if (maVar != null) {
                if (maVar instanceof la) {
                    obj3 = ((la) maVar).f17684a;
                } else {
                    if (!(maVar instanceof ka)) {
                        throw new ij.j();
                    }
                    obj3 = ((ka) maVar).f17570a;
                }
                obj4 = obj3;
            }
            qfVar.getClass();
            return new la(new sf());
        }
        if (!Intrinsics.a(string, "fixed")) {
            throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
        }
        pc pcVar = (pc) syVar.f18475n3.getValue();
        if (maVar != null) {
            if (maVar instanceof la) {
                obj2 = ((la) maVar).f17684a;
            } else {
                if (!(maVar instanceof ka)) {
                    throw new ij.j();
                }
                obj2 = ((ka) maVar).f17570a;
            }
            obj4 = obj2;
        }
        pcVar.getClass();
        return new ka(pc.a(parsingContext, (rc) obj4, jSONObject));
    }

    private final Object j(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        ((Number) JsonPropertyParser.read(parsingContext, jSONObject, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue();
        return new nc.e();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object k(com.yandex.div.serialization.ParsingContext r14, java.lang.Object r15) {
        /*
            r13 = this;
            r1 = r15
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            fh.lb r15 = new fh.lb
            com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
            kotlin.jvm.functions.Function1<java.lang.Number, java.lang.Long> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
            fh.m9 r5 = fh.mb.f17797e
            com.yandex.div.json.expressions.Expression r6 = fh.mb.f17793a
            java.lang.String r2 = "disappear_duration"
            r0 = r14
            com.yandex.div.json.expressions.Expression r14 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
            r7 = r3
            r8 = r4
            if (r14 != 0) goto L19
            r14 = r6
        L19:
            java.lang.String r2 = "download_callbacks"
            fh.sy r9 = r13.f17049b
            ij.p r3 = r9.R2
            java.lang.Object r2 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r2, r3)
            fh.ob r2 = (fh.ob) r2
            com.yandex.div.internal.parser.TypeHelper<java.lang.Boolean> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_BOOLEAN
            kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_BOOLEAN
            com.yandex.div.json.expressions.Expression r5 = fh.mb.f17794b
            java.lang.String r2 = "is_enabled"
            com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5)
            if (r2 != 0) goto L35
            r10 = r5
            goto L36
        L35:
            r10 = r2
        L36:
            java.lang.String r2 = "log_id"
            com.yandex.div.internal.parser.TypeHelper<java.lang.String> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
            com.yandex.div.json.expressions.Expression r11 = com.yandex.div.internal.parser.JsonExpressionParser.readExpression(r0, r1, r2, r3)
            fh.m9 r5 = fh.mb.f17798f
            com.yandex.div.json.expressions.Expression r6 = fh.mb.f17795c
            java.lang.String r2 = "log_limit"
            r3 = r7
            r4 = r8
            com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
            if (r2 != 0) goto L4e
            r7 = r6
            goto L4f
        L4e:
            r7 = r2
        L4f:
            java.lang.String r2 = "payload"
            java.lang.Object r2 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r2)
            r8 = r2
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            com.yandex.div.internal.parser.TypeHelper<android.net.Uri> r2 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_URI
            kotlin.jvm.functions.Function1<java.lang.Object, android.net.Uri> r5 = com.yandex.div.internal.parser.ParsingConvertersKt.ANY_TO_URI
            java.lang.String r6 = "referer"
            com.yandex.div.json.expressions.Expression r12 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r6, r2, r5)
            java.lang.String r6 = "scope_id"
            java.lang.Object r6 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = "typed"
            ij.p r9 = r9.f18345b1
            java.lang.Object r6 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r6, r9)
            fh.i5 r6 = (fh.i5) r6
            java.lang.String r6 = "url"
            com.yandex.div.json.expressions.Expression r9 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r6, r2, r5)
            fh.m9 r5 = fh.mb.f17799g
            com.yandex.div.json.expressions.Expression r6 = fh.mb.f17796d
            java.lang.String r2 = "visibility_percentage"
            com.yandex.div.json.expressions.Expression r0 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
            r4 = r10
            r10 = r8
            r8 = r9
            if (r0 != 0) goto L90
            r9 = r6
            r3 = r14
            r2 = r15
            r5 = r11
            r6 = r7
        L8e:
            r7 = r12
            goto L96
        L90:
            r9 = r0
            r3 = r14
            r2 = r15
            r6 = r7
            r5 = r11
            goto L8e
        L96:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.d2.k(com.yandex.div.serialization.ParsingContext, java.lang.Object):java.lang.Object");
    }

    private final Object l(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean zA = Intrinsics.a(string, "shape_drawable");
        sy syVar = this.f17049b;
        if (zA) {
            ((co) syVar.K6.getValue()).deserialize(parsingContext, jSONObject);
            return new qb();
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        sb sbVar = orThrow instanceof sb ? (sb) orThrow : null;
        if (sbVar != null) {
            return ((rb) syVar.W2.getValue()).resolve(parsingContext, sbVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0bf9  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0c0c  */
    @Override // com.yandex.div.serialization.Deserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deserialize(com.yandex.div.serialization.ParsingContext r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 3862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.d2.deserialize(com.yandex.div.serialization.ParsingContext, java.lang.Object):java.lang.Object");
    }
}
