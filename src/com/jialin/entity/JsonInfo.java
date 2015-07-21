/*package com.jialin.entity;

public class JsonInfo<string> {
 
	public enum JsonStatusCode
    {
        /// <summary>
        /// 操作成功
        /// </summary>
        Ok,
        /// <summary>
        /// 操作失败
        /// </summary>
        Error,
        /// <summary>
        /// 会话超时
        /// </summary>
        Timeout
    }
	
	public enum JsonCallbackType
    {
        /// <summary>
        /// 关闭指定navTabId窗体
        /// </summary>
        CloseCurrent,
        /// <summary>
        /// 转向指定地址
        /// </summary>
        Forward,
        /// <summary>
        /// 无回调
        /// </summary>
        None
    }
	
	
	
	

     private JsonStatusCode _statusCode;
     private string _message;
     private string _navTabId;
     private JsonCallbackType _callbackType;
     private string _forwardUrl;
     private boolean _writeToDB = true;   //是否写入DB

     
     /// <summary>
     /// 构造函数
     /// </summary>
     public JsonInfo()
     {
         this.StatusCode = JsonStatusCode.Ok;
         this.CallbackType = JsonCallbackType.None;
     }

     /// <summary>
     /// 构造函数
     /// </summary>
     /// <param name="statusCode">状态码</param>
     public JsonInfo(JsonStatusCode statusCode):this(statusCode, null)
        
     {
     }

     /// <summary>
     /// 构造函数
     /// </summary>
     /// <param name="statusCode">状态码</param>
     /// <param name="message">提示信息</param>
     public JsonInfo(JsonStatusCode statusCode, string message)
         : this(statusCode, message, JsonCallbackType.None)
     {
     }

     /// <summary>
     /// 构造函数
     /// </summary>
     /// <param name="statusCode">状态码</param>
     /// <param name="message">提示信息</param>
     /// <param name="callbackType">回调类型</param>
     public JsonInfo(JsonStatusCode statusCode, string message, JsonCallbackType callbackType)
         : this(statusCode, message, callbackType, null, null)
     {
     }

     /// <summary>
     /// 构造函数
     /// </summary>
     /// <param name="statusCode">状态码</param>
     /// <param name="message">提示信息</param>
     /// <param name="callbackType">回调类型</param>
     /// <param name="navTabId">窗口标签ID，当callbackType=Forward时设置</param>
     /// <param name="forwardUrl">转向地址，当callbackType=Forward时设置</param>
     public JsonInfo(JsonStatusCode statusCode, string message, JsonCallbackType callbackType, string navTabId, string forwardUrl)
     {
         this._statusCode = statusCode;
         this._message = message;
         this._callbackType = callbackType;
         this._navTabId = navTabId;
         this._forwardUrl = forwardUrl;
     }

    

     /// <summary>
     /// 获取或设置 状态码
     /// </summary>
     public JsonStatusCode StatusCode
     {
         get { return _statusCode; }
         set { _statusCode = value; }
     }

     /// <summary>
     /// 获取或设置 提示信息
     /// </summary>
     public string Message
     {
         get { return _message.Replace("\"","'"); }
         set { _message = value; }
     }

     /// <summary>
     /// 获取或设置 窗口标签ID
     /// </summary>
     public string NavTabId
     {
         get { return _navTabId; }
         set { _navTabId = value; }
     }

     /// <summary>
     /// 获取或设置 回调类型
     /// </summary>
     public JsonCallbackType CallbackType
     {
         get { return _callbackType; }
         set { _callbackType = value; }
     }

     /// <summary>
     /// 获取或设置 转向地址
     /// </summary>
     public string ForwardUrl
     {
         get { return _forwardUrl; }
         set { _forwardUrl = value; }
     }

     /// <summary>
     /// 是否需要写入当前日志数据库,默认为true
     /// </summary>
     public bool WriteToDB
     {
         get { return _writeToDB; }
         set { _writeToDB = value; }
     }
     

    
     public override string ToString()
     {
         StringBuilder sb = new StringBuilder();

         string statusCode = "";
         switch (_statusCode)
         {
             case JsonStatusCode.Ok:
                 statusCode = "200";
                 break;
             case JsonStatusCode.Error:
                 statusCode = "300";
                 break;
             case JsonStatusCode.Timeout:
                 statusCode = "301";
                 break;
         }

         string callbackType = "";
         switch (_callbackType)
         {
             case JsonCallbackType.CloseCurrent:
                 callbackType = "closeCurrent"; 
                 break;
             case JsonCallbackType.Forward:
                 callbackType = "forward";
                 break;
             case JsonCallbackType.None:
                 break;
         }

         sb.Append("{");
         sb.AppendFormat("  \"statusCode\":\"{0}\",", statusCode);
         sb.AppendFormat("  \"message\":\"{0}\",", _message);
         sb.AppendFormat("  \"navTabId\":\"{0}\",", _navTabId);
         sb.AppendFormat("  \"callbackType\":\"{0}\",", callbackType);
         sb.AppendFormat("  \"forwardUrl\":\"{0}\"", _forwardUrl);
         sb.Append("}");

         ////保存操作日志
         //if (_writeToDB)
         //    EventHelper.SaveEvent(EventType.OperateLog, _message);

         return sb.ToString();
     }

     public string TodialogIdString()
     {
         StringBuilder sb = new StringBuilder();

         string statusCode = "";
         switch (_statusCode)
         {
             case JsonStatusCode.Ok:
                 statusCode = "200";
                 break;
             case JsonStatusCode.Error:
                 statusCode = "300";
                 break;
             case JsonStatusCode.Timeout:
                 statusCode = "301";
                 break;
         }

         string callbackType = "";
         switch (_callbackType)
         {
             case JsonCallbackType.CloseCurrent:
                 callbackType = "closeCurrent";
                 break;
             case JsonCallbackType.Forward:
                 callbackType = "forward";
                 break;
             case JsonCallbackType.None:
                 break;
         }

         sb.Append("{");
         sb.AppendFormat("  \"statusCode\":\"{0}\",", statusCode);
         sb.AppendFormat("  \"message\":\"{0}\",", _message);
         sb.AppendFormat("  \"dialogId\":\"{0}\",", _navTabId);
         sb.AppendFormat("  \"callbackType\":\"{0}\",", callbackType);
         sb.AppendFormat("  \"forwardUrl\":\"{0}\"", _forwardUrl);
         sb.Append("}");

         ////保存操作日志
         //if (_writeToDB)
         //    EventHelper.SaveEvent(EventType.OperateLog, _message);

         return sb.ToString();
     }
     
 }

*/