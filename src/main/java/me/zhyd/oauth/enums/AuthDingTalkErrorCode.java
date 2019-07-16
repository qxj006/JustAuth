package me.zhyd.oauth.enums;

/**
 * 钉钉授权登录时的异常状态码
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @since 1.8
 */
public enum AuthDingTalkErrorCode {
    EC1_MINUS(-1, "系统繁忙", "服务器暂不可用，建议稍候再重试1次，最多重试3次"),
    EC0(0, "请求成功", "接口调用成功"),
    EC404(404, "请求的URI地址不存在", "地址不存在，检查下url是否和文档里写的一致"),
    EC33001(33001, "无效的企业ID", "请确认下access_token是否正确"),
    EC33002(33002, "无效的微应用的名称", "校验下微应用的名称字段，不能为空且长度不能超过10个字符"),
    EC33003(33003, "无效的微应用的描述", "校验下微应用的描述字段，不能为空且长度不能超过20个字符"),
    EC33004(33004, "无效的微应用的ICON", "校验下微应用的icon字段，不能为空且确保图标存在"),
    EC33005(33005, "无效的微应用的移动端主页", "校验下微应用的移动端主页，不能为空且必须以http开头或https开头"),
    EC33006(33006, "无效的微应用的PC端主页", "校验下微应用的PC端主页，必须以http开头或https开头"),
    EC33007(33007, "微应用的移动端的主页与PC端主页不同", "校验下微应用的PC端主页，确保它和移动端主页的域名保持一致"),
    EC33008(33008, "无效的微应用OA后台的主页", "校验下微应用的后台管理的主页失败，必须以http开头或https开头"),
    EC34001(34001, "无效的会话id", "检查下所传的chatId字段是否为空"),
    EC34002(34002, "无效的会话消息的发送者", "检查下sender字段是否为空"),
    EC34003(34003, "无效的会话消息的发送者的企业Id", "检查下发送者的企业Id"),
    EC34004(34004, "无效的会话消息的类型", "检查下msgtype字段，是否为空，是否是定义的那几种类型"),
    EC34005(34005, "无效的会话音频消息的播放时间", "该错误码已废弃"),
    EC34006(34006, "发送者不在企业中", "检查下发送者是否在企业中"),
    EC34007(34007, "发送者不在会话中", "检查下发送者是否在会话id中"),
    EC34008(34008, "图片不能为空", "如果发的是图片消息，检查下图片是否为空"),
    EC34009(34009, "链接内容不能为空", "检查下messageUrl字段是否为空"),
    EC34010(34010, "文件不能为空", "检查下media_id字段是否为空"),
    EC34011(34011, "音频文件不能为空", "检查下media_id字段是否为空"),
    EC34012(34012, "找不到发送者的企业", "检查下发送者是否是真实的"),
    EC34013(34013, "找不到群会话对象", "检查下chatid是否真实存在"),
    EC34014(34014, "会话消息的json结构无效或不完整", "检查下消息的json格式是否正确，json的key对应msgtype的value值"),
    EC34015(34015, "发送群会话消息失败", "消息发送失败，建议稍后再重试下"),
    EC34016(34016, "消息内容长度超过限制", "检查下消息的content字段长度是否超过5000，title字段长度是否超过64，markdown字段长度是否超过5000，single_title字段长度是否超过20，single_url字段长度是否超过500，btn_json_list字段长度是否超过1000"),
    EC40001(40001, "获取access_token时Secret错误，或者access_token无效", "检查下access_token是否正确"),
    EC40002(40002, "不合法的凭证类型", "无"),
    EC40003(40003, "不合法的UserID", "确保该id在通讯录中存在，且是在你所传access_token对应的企业里"),
    EC40004(40004, "不合法的媒体文件类型", "检查下type字段，只支持image，voice，file"),
    EC40005(40005, "不合法的文件类型", "如果是文件类型，检查下是否是支持的那几种，目前只支持doc，docx，xls，xlsx，ppt，pptx，zip，pdf，rar"),
    EC40006(40006, "不合法的文件大小", "检查下文件大小，image类型最大1MB，file类型最大10MB，voice类型最大2MB"),
    EC40007(40007, "不合法的媒体文件id", "检查下mediaId是否为空，是否真实存在"),
    EC40008(40008, "不合法的消息类型", "检查下msgtype是否为空，确保它在开放平台定义的几种类型里，具体见消息类型及格式"),
    EC40009(40009, "不合法的部门id", "检查下部门id是否为空，是否为数字且大于0"),
    EC40010(40010, "不合法的父部门id", "检查下父部门id是否为一个数字"),
    EC40011(40011, "不合法的排序order", "检查下order字段是否为空，是否为数字且大于0"),
    EC40012(40012, "不合法的发送者", "检查下sender字段是否为空，是否真实存在"),
    EC40013(40013, "不合法的corpid", "检查下corpid是否有效"),
    EC40014(40014, "不合法的access_token", "检查下access_token是否正确，注意access_token这个参数应该是带在url后面的"),
    EC40015(40015, "发送者不在会话中", "检查下sender字段和cid字段是否能对应上"),
    EC40016(40016, "不合法的会话ID", "检查下cid字段是否为空，是否有效"),
    EC40017(40017, "在会话中没有找到与发送者在同一企业的人", "cid对应的消息接收者为空，检查下cid字段"),
    EC40018(40018, "不允许以递归方式查询部门用户列表", "检查下fetchChild字段，目前不支持递归查询"),
    EC40019(40019, "该手机号码对应的用户最多可以加入5个非认证企业", "无"),
    EC40020(40020, "当前团队人数已经达到上限，用电脑登录钉钉企业管理后台，升级成为认证企业", "无"),
    EC40021(40021, "更换的号码已注册过钉钉，无法使用该号码", "无"),
    EC40022(40022, "企业中的手机号码和登录钉钉的手机号码不一致，暂时不支持修改用户信息，可以删除后重新添加", "无"),
    EC40023(40023, "部门人数达到上限", "部门人数不能超过1000"),
    EC40024(40024, "(安全校验不通过)保存失败，团队人数超限。请在手机钉钉绑定支付宝完成实名认证，或者申请企业认证，人数上限自动扩充", "无"),
    EC40025(40025, "无效的部门JSONArray对象，合法格式需要用中括号括起来，且如果属于多部门，部门id需要用逗号分隔", "无"),
    EC40029(40029, "不合法的oauth_code", "无"),
    EC40031(40031, "不合法的UserID列表", "指定的UserID列表，至少存在一个UserID不在通讯录中"),
    EC40032(40032, "不合法的UserID列表长度", "检查下列表是否为空，且长度合适。创建部门接口的userPerimits最多接收10000个"),
    EC40033(40033, "不合法的请求字符，不能包含\\uxxxx格式的字符", "无"),
    EC40035(40035, "不合法的参数", "检查下有没有传请求参数，一般发生在http post形式的接口里，没有传参数"),
    EC40038(40038, "不合法的请求格式", "检查下参数中是不是少了某个字段，具体参考各个文档的参数介绍"),
    EC40039(40039, "不合法的URL长度", "无"),
    EC40048(40048, "url中包含不合法domain", "发消息接口中消息url链接不安全"),
    EC40055(40055, "不合法的agent结构", "已废弃"),
    EC40056(40056, "不合法的agentid", "检查下agentid字段是否为空，是否真实存在"),
    EC40057(40057, "不合法的callbackurl", "无"),
    EC40061(40061, "设置应用头像失败", "无"),
    EC40062(40062, "不合法的应用模式", "无"),
    EC40063(40063, "不合法的分机号", "tel字段长度超长，长度不能超过50"),
    EC40064(40064, "不合法的工作地址", "workPlace长度超长，长度不能超过50个字符"),
    EC40065(40065, "不合法的备注", "remark长度超长，长度不能超过1024个字符"),
    EC40066(40066, "不合法的部门列表", "部门id列表长度太长，不能超过10000，并且每个id必须是数字"),
    EC40067(40067, "标题长度不合法", "检查下标题长度"),
    EC40068(40068, "不合法的偏移量", "偏移量必须大于0"),
    EC40069(40069, "不合法的分页大小", "分页大小不合法，具体参考每个接口的参数定义"),
    EC40070(40070, "不合法的排序参数", "具体参考获取部门成员接口里面对order字段的定义"),
    EC40073(40073, "不存在的openid", "openid不能为空"),
    EC40077(40077, "不存在的预授权码", "无"),
    EC40078(40078, "不存在的临时授权码", "临时授权码不能为空，且只能被使用一次"),
    EC40079(40079, "不存在的授权信息", "检查下企业是否授权"),
    EC40080(40080, "不合法的suitesecret", "无"),
    EC40082(40082, "不合法的suitetoken", "检查下token"),
    EC40083(40083, "不合法的suiteid", "suiteKey字段不合法"),
    EC40084(40084, "不合法的永久授权码", "检查下永久授权码是否正确"),
    EC40085(40085, "不存在的suiteticket", "检查下suiteticket是否正确，确保是由回调接口正确来接收suiteticket"),
    EC40086(40086, "不合法的第三方应用appid", "appid字段不能为空"),
    EC40087(40087, "创建永久授权码失败", "稍后再重试下，确保参数都传对"),
    EC40088(40088, "不合法的套件key或secret", "稍后再重试下，确保suiteKey和suiteSecret都传对且一一对应"),
    EC40089(40089, "不合法的corpid或corpsecret", "稍后再重试下，确保corpid和corpsecret字段传对且一一对应"),
    EC40090(40090, "套件已经不存在", "检查下suiteKey字段是否正确"),
    EC40091(40091, "用户授权码创建失败，需要用户重新授权", "创建永久授权码失败，需要用户重新授权产生临时授权码"),
    EC40103(40103, "用户开启了账号保护，无法被加入到您的团队", "用户在钉钉“我的-设置-隐私”出开启了账号保护"),
    EC40104(40104, "无效手机号", "检查手机号格式是否正确"),
    EC41001(41001, "缺少access_token参数", "检查下access_token是否传了，注意该参数必须跟在请求url中"),
    EC41002(41002, "缺少corpid参数", "检查下corpid是否为空"),
    EC41003(41003, "缺少refresh_token参数", "检查下refresh_token是否为空"),
    EC41004(41004, "缺少secret参数", "检查下secret参数是否为空"),
    EC41005(41005, "缺少多媒体文件数据", "无"),
    EC41006(41006, "缺少media_id参数", "检查下media_id参数是否为空"),
    EC41007(41007, "无效的ssocode", "sso的永久授权code无效，检查下是否为空"),
    EC41008(41008, "缺少oauth", "无"),
    EC41009(41009, "缺少UserID", "检查下UserID是否为空"),
    EC41010(41010, "缺少url", "检查下url是否为空"),
    EC41011(41011, "缺少agentid", "检查下agentid是否为空"),
    EC41012(41012, "缺少应用头像mediaid", "检查下mediaid是否为空"),
    EC41013(41013, "缺少应用名字", "检查应用名字是否为空"),
    EC41014(41014, "缺少应用描述", "检查应用描述是否为空"),
    EC41015(41015, "缺少JSON参数", "检查JSON参数是否为空"),
    EC41021(41021, "缺少suitekey", "检查suitekey参数是否为空"),
    EC41022(41022, "缺少suitetoken", "检查suitetoken参数是否为空"),
    EC41023(41023, "缺少suiteticket", "检查suiteticket参数是否为空"),
    EC41024(41024, "缺少suitesecret", "检查suitesecret参数是否为空"),
    EC41025(41025, "缺少permanent_code", "检查permanent_code永久授权码参数是否为空"),
    EC41026(41026, "缺少tmp_auth_code", "检查tmp_auth_code临时授权码参数是否为空"),
    EC41027(41027, "需要授权企业的corpid参数", "检查corpid参数是否为空"),
    EC41028(41028, "禁止给全员发送消息", "检查是否有全员发送消息的权限，ISV没有该权限"),
    EC41029(41029, "超过消息接收者人数上限", "发送OA消息人数超上限（企业消息人数上限：5000，ISV消息人数上限：1000）"),
    EC41030(41030, "企业未对该套件授权", "检查该企业是否已经对该套件进行授权"),
    EC41031(41031, "auth_corpid和permanent_code不匹配", "激活套件时使用的auth_corpid和permanent_code不匹配"),
    EC41041(41041, "查询间隔时间太长", "考勤打卡数据查询间隔时间超过7天"),
    EC41044(41044, "禁止发送消息", "检查是否有权限发送消息"),
    EC41045(41045, "单应用全员消息/每天总量超限", "无"),
    EC41046(41046, "超过发送全员消息的每分钟次数上限", "企业OA消息全员发送每天不能超过3次，ISV不能发送全员消息"),
    EC41047(41047, "超过给该企业发消息的每分钟次数上限", "企业OA消息每分钟不能超过1500次，ISV OA消息每分钟不能超过200次"),
    EC41048(41048, "超过给企业发消息的每分钟次数总上限", ""),
    EC41049(41049, "包含违禁内容", "检查消息文本中是否有黄色、反动等词语"),
    EC41050(41050, "无效的活动编码", "无"),
    EC41051(41051, "活动权益的校验失败", "无"),
    EC41100(41100, "时间参数不合法", "时间参数不能为空，且为“yyyy-MM-dd hh:mm:ss”格式"),
    EC41101(41101, "数据内容过长", "请求体字符长度不能大于4096"),
    EC41102(41102, "参数值过大", "上传文件或者idlist等参数过大"),
    EC42001(42001, "access_token超时", "请检查网络状态"),
    EC42002(42002, "refresh_token超时", "请检查网络状态"),
    EC42003(42003, "oauth_code超时", "请检查网络状态"),
    EC42007(42007, "预授权码失效", "请检查该预授权码是否已经使用过"),
    EC42008(42008, "临时授权码失效", "请检查该临时授权码是否已经使用过或者是否不正确"),
    EC42009(42009, "suitetoken失效", "请检查该suitetoken是否已经过期"),
    EC43001(43001, "需要GET请求", "请检查http请求方式是否正确"),
    EC43002(43002, "需要POST请求", "请检查http请求方式是否正确"),
    EC43003(43003, "需要HTTPS", "请检查调用接口协议是否是https"),
    EC43004(43004, "无效的HTTP HEADER Content-Type", "请检查请求头中的content-type是否正确"),
    EC43005(43005, "需要Content-Type为application/json;charset=UTF-8", "请检查请求头中的content-type是否是“application/json;charset=UTF-8”"),
    EC43007(43007, "需要授权", "该接口需要access_token才能调用"),
    EC43008(43008, "参数需要multipart类型", "检查提交参数中的ENCTYPE是否是multipart类型"),
    EC43009(43009, "post参数需要json类型", "请检查post参数数据是否是json类型"),
    EC44001(44001, "多媒体文件为空", "请检查多媒体文件数据是否为空"),
    EC44002(44002, "POST的数据包为空", "请检查POST的数据包是否为空"),
    EC44003(44003, "图文消息内容为空", "请检查图文消息参数是否为空"),
    EC44004(44004, "文本消息内容为空", "请检查文本消息参数是否为空"),
    EC45001(45001, "多媒体文件大小超过限制", "无"),
    EC45002(45002, "消息内容超过限制", "无"),
    EC45003(45003, "标题字段超过限制", "无"),
    EC45004(45004, "描述字段超过限制", "无"),
    EC45005(45005, "链接字段超过限制", "无"),
    EC45006(45006, "图片链接字段超过限制", "无"),
    EC45007(45007, "语音播放时间超过限制", "无"),
    EC45008(45008, "图文消息超过限制", "无"),
    EC45009(45009, "接口调用超过限制", "无"),
    EC45016(45016, "系统分组，不允许修改", "无"),
    EC45017(45017, "分组名字过长", "无"),
    EC45018(45018, "分组数量超过上限", "无"),
    EC45024(45024, "账号数量超过上限", "无"),
    EC46001(46001, "不存在媒体数据", "无"),
    EC46004(46004, "不存在的员工", "无"),
    EC47001(47001, "解析JSON/XML内容错误", "无"),
    EC48002(48002, "Api禁用", "无"),
    EC48003(48003, "suitetoken无效", "无"),
    EC48004(48004, "授权关系无效", "无"),
    EC49000(49000, "缺少chatid", "请检查参数中是否有chatid"),
    EC49001(49001, "绑定的微应用超过个数限制", "绑定群会话和微应用超过5个"),
    EC49002(49002, "一个群只能被一个ISV套件绑定一次", "无"),
    EC49003(49003, "操作者必须为群主", "无"),
    EC49004(49004, "添加成员列表和删除成员列表不能有交集", "无"),
    EC49005(49005, "群人数超过人数限制", "无"),
    EC49006(49006, "群成员列表必须包含群主", "无"),
    EC49007(49007, "超过创建群的个数上限", "无"),
    EC49008(49008, "不合法的群类型，只能传入0或2", "无"),
    EC49009(49009, "企业群不能添加外部联系人，群主只能为企业员工", "无"),
    EC49010(49010, "群成员不能为空", "无"),
    EC49011(49011, "群员工列表超长", "无"),
    EC49012(49012, "群外部联系人列表超长", "无"),
    EC49013(49013, "群主不能为空", "无"),
    EC49014(49014, "非法的群主类型，只能为emp或者ext", "无"),
    EC49015(49015, "不合法的群名称", "无"),
    EC49016(49016, "查询企业员工不存在", "无"),
    EC49017(49017, "查询企业外部联系人不存在", "无"),
    EC49018(49018, "群主非企业员工", "无"),
    EC49019(49019, "群主非企业外部通讯录人员", "无"),
    EC49020(49020, "某人处于勿扰模式，拒绝加入群聊；请先与TA建立好友关系", "无"),
    EC49021(49021, "非好友建立群聊，认证用户一天只能拉50个人，非认证用户一天只能拉10个人", "无"),
    EC49022(49022, "某人拒绝加入群聊", "无"),
    EC49023(49023, "某人处于勿扰模式，拒绝加入群聊；请先与TA建立好友关系", "无"),
    EC50001(50001, "redirect_uri未授权", "无"),
    EC50002(50002, "员工不在权限范围", "无"),
    EC50003(50003, "应用已停用", "无"),
    EC50004(50004, "企业部门不在授权范围", "检查企业部门是否设置可见范围，具体排查方法请参考通讯录FAQ"),
    EC50005(50005, "企业已禁用", "无"),
    EC52010(52010, "无效的corpid", "请检查corpid参数是否正确"),
    EC52011(52011, "jsapi ticket 读取失败", "请检查ticket参数是否正确"),
    EC52012(52012, "jsapi 签名生成失败", "请检查“url, nonceStr, timestamp, ticket”等参数是否正确"),
    EC52013(52013, "签名校验失败", "请检查“url, nonceStr, timestamp, ticket”等参数是否正确"),
    EC52014(52014, "无效的url参数", "请检查url参数是否正确"),
    EC52015(52015, "无效的随机字符串参数", "请检查nonceStr参数是否正确"),
    EC52016(52016, "无效的签名参数", "请检查“url, nonceStr, timestamp, ticket”等参数是否正确"),
    EC52017(52017, "无效的jsapi列表参数", "请检查dd.config中的jsApiList参数是否正确"),
    EC52018(52018, "无效的时间戳", "请检查timestamp参数是否正确"),
    EC52019(52019, "无效的agentid", "请检查agentid参数是否正确"),
    EC60001(60001, "不合法的部门名称", "请检查部门名称是否正确，长度不能超过64个字符"),
    EC60002(60002, "部门层级深度超过限制", "无"),
    EC60003(60003, "部门不存在", "无"),
    EC60004(60004, "父亲部门不存在", "无"),
    EC60005(60005, "不允许删除有成员的部门", "无"),
    EC60006(60006, "不允许删除有子部门的部门", "无"),
    EC60007(60007, "不允许删除根部门", "无"),
    EC60008(60008, "父部门下该部门名称已存在", "无"),
    EC60009(60009, "部门名称含有非法字符", "无"),
    EC60010(60010, "部门存在循环关系", "无"),
    EC60011(60011, "没有调用该接口的权限", "请检查当前请求使用的access_token是否有对该部门/人的操作权限，查看获取appSecret授权范围"),
    EC60012(60012, "不允许删除默认应用", "无"),
    EC60013(60013, "不允许关闭应用", "无"),
    EC60014(60014, "不允许开启应用", "无"),
    EC60015(60015, "不允许修改默认应用可见范围", "无"),
    EC60016(60016, "部门id已经存在", "无"),
    EC60017(60017, "不允许设置企业", "无"),
    EC60018(60018, "不允许更新根部门", "无"),
    EC60019(60019, "从部门查询人员失败", "请检查该成员是否在该部门中"),
    EC60020(60020, "访问ip不在白名单之中", "如果是企业应用，检查配置的服务器出口ip地址是否和请求ip地址一致。如果是isv应用，请检查套件ip白名单和请求ip是否一致"),
    EC60067(60067, "部门的企业群群主不存在", "无"),
    EC60068(60068, "部门的管理员不存在", "无"),
    EC60102(60102, "UserID在公司中已存在", "无"),
    EC60103(60103, "手机号码不合法", "无"),
    EC60104(60104, "手机号码在公司中已存在", "无"),
    EC60105(60105, "邮箱不合法", "无"),
    EC60106(60106, "邮箱已存在", "无"),
    EC60107(60107, "使用该手机登录钉钉的用户已经在企业中", "无"),
    EC60110(60110, "部门个数超出限制", "无"),
    EC60111(60111, "UserID不存在", "无"),
    EC60112(60112, "用户name不合法", "无"),
    EC60113(60113, "身份认证信息（手机/邮箱）不能同时为空", "无"),
    EC60114(60114, "性别不合法", "无"),
    EC60118(60118, "用户无有效邀请字段（邮箱，手机号）", "无"),
    EC60119(60119, "不合法的position", "无"),
    EC60120(60120, "用户已禁用", "无"),
    EC60121(60121, "找不到该用户", "检查该企业下该员工是否存在"),
    EC60122(60122, "不合法的extattr", "无"),
    EC60123(60123, "不合法的jobnumber", "无"),
    EC60124(60124, "用户不在此群中", "无"),
    EC60125(60125, "CRM配置信息创建失败", "无"),
    EC60126(60126, "CRM配置信息更新失败", "无"),
    EC60127(60127, "CRM人员配置信息删除失败", "无"),
    EC70001(70001, "企业不存在或者已经被解散", "无"),
    EC70002(70002, "获取套件下的微应用失败", "无"),
    EC70003(70003, "agentid对应微应用不存在", "无"),
    EC70004(70004, "企业下没有对应该agentid的微应用", "注意：代表应用和企业映射关系的ID (appId的实例化ID)，同一个ISV应用在不同企业的agentId不一致"),
    EC70005(70005, "ISV激活套件失败", "请检查激活套件使用的参数是否正确"),
    EC71006(71006, "回调地址已经存在", "无"),
    EC71007(71007, "回调地址已不存在", "无"),
    EC71008(71008, "回调call_back_tag必须在指定的call_back_tag列表中", "无"),
    EC71009(71009, "返回文本非success", "回调地址返回的内容必须是“success”文本经过加密后的结果"),
    EC71010(71010, "POST的JSON数据不包含所需要的参数字段或包含的参数格式非法", "无"),
    EC71011(71011, "传入的url参数不是合法的url格式", "合法的URL地址是协议+域名+端口+路径path+参数组成"),
    EC71012(71012, "url地址访问异常", "无"),
    EC71013(71013, "此域名或IP不能注册或者接收回调事件", "注意回调地址的域名或者IP必须在套件的ip白名单中，并且该ip必须为外网ip"),
    EC72001(72001, "获取钉盘空间失败", "检查domain、agent_id、access_token参数是否正确有效"),
    EC72002(72002, "授权钉盘空间访问权限失败", "无"),
    EC80001(80001, "可信域名没有IPC备案，后续将不能在该域名下正常使用jssdk", "无"),
    EC81001(81001, "两个用户没有任何关系，请先相互成为好友", "无"),
    EC81002(81002, "用户拒收消息", "无"),
    EC88005(88005, "管理日历个人日历操作失败", "无"),
    EC89001(89001, "管理日历启动导出任务失败", "无"),
    EC89011(89011, "管理日历写入数据失败", "无"),
    EC89012(89012, "管理日历更新数据失败", "无"),
    EC90001(90001, "您的服务器调用钉钉开放平台所有接口的请求都被暂时禁用了", "无"),
    EC90002(90002, "您的服务器调用钉钉开放平台当前接口的所有请求都被暂时禁用了", "无"),
    EC90003(90003, "您的企业调用钉钉开放平台所有接口的请求都被暂时禁用了，仅对企业自己的Accesstoken有效", "无"),
    EC90004(90004, "您当前使用的CorpId及CorpSecret被暂时禁用了，仅对企业自己的Accesstoken有效", "无"),
    EC90005(90005, "您的企业调用当前接口次数过多，请求被暂时禁用了，仅对企业自己的Accesstoken有效", "无"),
    EC90006(90006, "您当前使用的CorpId及CorpSecret调用当前接口次数过多，请求被暂时禁用了，仅对企业自己的Accesstoken有效", "无"),
    EC90007(90007, "您当前要调用的企业的接口次数过多，对该企业的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC90008(90008, "您当前要调用的企业的当前接口次数过多，对此企业下该接口的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC90009(90009, "您调用企业接口超过了限制，对所有企业的所有接口的请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC90010(90010, "您调用企业当前接口超过了限制，对所有企业的该接口的请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC90011(90011, "您的套件调用企业接口超过了限制，该套件的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC90012(90012, "您的套件调用企业当前接口超过了限制，该套件对此接口的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC90013(90013, "您的套件调用当前企业的接口超过了限制，该套件对此企业的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC90014(90014, "您的套件调用企业当前接口超过了限制，该套件对此企业该接口的所有请求都被暂时禁用了，仅对企业授权给ISV的Accesstoken有效", "无"),
    EC900001(900001, "加密明文文本非法", "加密明文不能为空"),
    EC900002(900002, "加密时间戳参数非法", "加密时间戳不能为空"),
    EC900003(900003, "加密随机字符串参数非法", "加密随机字符串不能为空"),
    EC900004(900004, "不合法的aeskey", "检查aeskey是否符合规格，长度固定为43个字符，从a-z, A-Z, 0-9共62个字符中选取，是AESKey的Base64编码。解码后即为32字节长的AESKey"),
    EC900005(900005, "签名不匹配", "检查签名计算的参数是否正确。请参考文档获取签名参数"),
    EC900006(900006, "计算签名错误", "检查签名计算的参数是否正确。请参考文档获取签名参数"),
    EC900007(900007, "计算加密文字错误", "检查是否安装JRE补丁或者对应的JRE版本是否正常。 请参考文档ISV应用开发准备工作"),
    EC900008(900008, "计算解密文字错误", "检查是否安装JRE补丁或者对应的JRE版本是否正常。 请参考文档ISV应用开发准备工作"),
    EC900009(900009, "计算解密文字长度不匹配", "检查aeskey是否符合规格。长度固定为43个字符，从a-z, A-Z, 0-9共62个字符中选取，是AESKey的Base64编码"),
    EC900010(900010, "计算解密文字corpid不匹配", "检查corpid是否正确或者是否为当前企业的corpid"),
    EC400010(400010, "激活的设备不存在（未绑定）", "无"),
    EC400011(400011, "设备已经激活", "无"),
    EC400020(400020, "无访问权限", "无"),
    EC400021(400021, "密钥错误", "无"),
    EC400022(400022, "设备不存在", "无"),
    EC400023(400023, "用户不存在", "无"),
    EC400040(400040, "回调不存在", "检查是否注册回调事件"),
    EC400041(400041, "回调已经存在", "检查该回调事件是否已注册过"),
    EC400042(400042, "企业不存在", "无"),
    EC400043(400043, "企业不合法", "无"),
    EC400050(400050, "回调地址无效", "检查回调地址是否正确或者符合地址格式"),
    EC400051(400051, "回调地址访问异常", "注意回调地址必须部署到外网以便开发平台通过回调地址推送回调信息"),
    EC400052(400052, "回调地址访返回数据错误", "无"),
    EC400053(400053, "回调地址在黑名单中无法注册", "回调地址已添加黑名单，无法注册"),
    EC400054(400054, "回调URL访问超时", "无"),
    EC400055(400055, "回调设备不在线", "无"),
    EC400056(400056, "回调访问设备失败", "无"),
    EC400057(400057, "回调访问设备不存在", "无"),
    EC420001(420001, "客户不存在", "无"),
    EC420002(420002, "客户查询失败", "无"),
    EC420003(420003, "联系人不存在", "无"),
    EC420004(420004, "联系人查询失败", "无"),
    EC420005(420005, "客户删除失败", "无"),
    EC420006(420006, "联系人删除失败", "无"),
    EC420007(420007, "跟进人绑定失败", "无"),
    EC420008(420008, "客户id非法", "无"),
    EC420009(420009, "跟进人id非法", "无"),
    EC4200010(4200010, "客户联系人id非法", "无"),
    EC4200011(4200011, "客户描述表单不存在", "无"),
    EC4200012(4200012, "客户描述表单查询失败", "无"),
    EC4200013(4200013, "联系人描述表单不存在", "无"),
    EC4200014(4200014, "联系人描述表单查询失败", "无"),
    EC4200015(4200015, "客户描述表单格式校验错误", "无"),
    EC4200016(4200016, "客户描述表单格缺少固定字段", "无"),
    EC4200017(4200017, "客户联系人描述表单格式校验错误", "无"),
    EC4200018(4200018, "客户联系人描述表单格缺少固定字段", "无"),
    EC4200019(4200019, "客户描述表单数据格式校验错误", "无"),
    EC4200020(4200020, "客户描述表单数据缺少固定字段", "无"),
    EC4200021(4200021, "客户联系人描述表单数据格式校验错误", "无"),
    EC4200022(4200022, "客户联系人描述表单数据缺少固定字段", "无"),
    EC800001(800001, "仅限ISV调用", "只有ISV微应用才能调用"),
    EC41042(41042, "加密失败", "无"),
    EC41043(41043, "解密失败", "无"),
    EC40100(40100, "分机号已经存在", "无"),
    EC40101(40101, "邮箱已经存在", "无"),
    EC33013(33013, "企业自建微应用的个数过多，通过接口创建微应用受限", "此限制只针对企业自建微应用，对ISV应用没有限制"),
    EC90017(90017, "此IP使用CorpId及CorpSecret调用接口的CorpId个数超过限制", "从该ip发起超过XX个corpid的请求被限制"),
    EC40102(40102, "过期的临时授权码", "注意临时授权只能使用一次后就不能在使用。 需要重新执行授权操作有开放平台推送新的临时授权码"),
    EC52020(52020, "未找到服务窗授权", "无"),
    EC52021(52021, "未找到微应用授权", "无"),
    EC52022(52022, "无效的jsapi类型", "无"),
    EC52023(52023, "无效的服务窗agentid", "检查服务窗微应用是否停用或者删除"),
    EC52024(52024, "无效的jsapi tag", "无"),
    EC52025(52025, "无效的安全微应用", "无"),
    EC52026(52026, "无效的安全微应用URL", "无"),
    EC71014(71014, "获取套件下的服务窗应用失败", "无"),
    EC72003(72003, "钉盘空间添加文件失败", "无"),
    EC60128(60128, "无效的主管id", "无"),
    EC200001(200001, "表单不能为空", "无"),
    EC200004(200004, "APP_ID 不允许为空", "app_id为创建套件成功后，创建的ISV微应用的微应用ID。 可以登录开发者后台查看"),
    EC200005(200005, "表单名称不允许为空", "无"),
    EC200006(200006, "表单内容不允许为空", "无"),
    EC200007(200007, "表单值不允许为空", "无"),
    EC200008(200008, "表单uuid不存在", "无"),
    EC400001(400001, "系统错误", "无"),
    EC400002(400002, "参数错误", "检查参数是否符合规格。具体请参考当前接口的文档的参数说明和参数示例"),
    EC400003(400003, "时间戳无效", "检查随机时间戳是否符合规格。具体请参考当前接口的文档的参数说明和参数示例"),
    EC400004(400004, "随机数无效", "检查随机随机数是否符合规格。具体请参考当前接口的文档的参数说明和参数示例");

    private int code;
    private String desc;
    private String solution;

    AuthDingTalkErrorCode(int code, String desc, String solution) {
        this.code = code;
        this.desc = desc;
        this.solution = solution;
    }

    public static AuthDingTalkErrorCode getErrorCode(int errorCode) {
        AuthDingTalkErrorCode[] errorCodes = AuthDingTalkErrorCode.values();
        for (AuthDingTalkErrorCode code : errorCodes) {
            if (code.getCode() == errorCode) {
                return code;
            }
        }
        return EC1_MINUS;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getSolution() {
        return solution;
    }
}